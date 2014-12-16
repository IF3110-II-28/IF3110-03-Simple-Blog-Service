package org.wbd.helper;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
*/
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;
import java.text.SimpleDateFormat;

import net.thegreshams.firebase4j.service.Firebase;
import net.thegreshams.firebase4j.error.FirebaseException;
import net.thegreshams.firebase4j.error.JacksonUtilityException;
import net.thegreshams.firebase4j.model.FirebaseResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;

import org.wbd.model.*;

public class DatabaseHelper {
	public static final String URL = "https://glaring-torch-5979.firebaseio.com/";
	//public static final String USER = "root";
	//public static final String PASSWORD = "";
	
	private static DatabaseHelper instance;
	/*private Connection conn;
	private PreparedStatement statement;
	private ResultSet result;
	*/
	private Firebase firebase;
	private FirebaseResponse response;
	
	private DatabaseHelper() {
		/*conn = null;
		statement = null;
		result = null;
		*/
		try {
			firebase = new Firebase(URL);
		} catch (FirebaseException e) {
			Logger logger = Logger.getLogger(Firebase.class.getName());
			logger.log(Level.SEVERE, e.getMessage(), e);
		}
	}
	
	public static DatabaseHelper getInstance() {
		if(instance == null) {
			instance = new DatabaseHelper();
		}
		return instance;
	}
	
	public List<User> getUsers() {
		try {
			response = firebase.get("User");
			Map<String, Object> users = response.getBody();
			List<User> temp = new ArrayList<User>();
			for(Map.Entry<String, Object> entry : users.entrySet()) {
				temp.add((User)entry.getValue());
			}
			return temp;
		} catch (FirebaseException e) {
			Logger logger = Logger.getLogger(Firebase.class.getName());
			logger.log(Level.SEVERE, e.getMessage(), e);
			return null;
		}
		/*try {
			connectDatabase(URL, USER, PASSWORD);
			
			String query = "SELECT * FROM user";
			ArrayList<User> users = new ArrayList<User>();
			statement = conn.prepareStatement(query);
			statement.executeQuery();
			result = statement.getResultSet();
			
			while(result.next()) {
				User user = new User();
				user.setUsername(result.getString(2));
				user.setPassword(result.getString(3));
				user.setRole(result.getString(4));
				users.add(user);
			}
			
			clearResult();
			clearStatement();
			disconnectDatabase();
			return users;
		} catch (SQLException ex) {
			return null;
		}
		*/
	}
	
	public List<Post> getPosts(String username, boolean published) {
		try {
			response = firebase.get("Post");
			Map<String, Object> posts = response.getBody();
			List<Post> temp = new ArrayList<Post>();
			for(Map.Entry<String, Object> entry : posts.entrySet()) {
				Post post = (Post)entry.getValue();
				if(post.getAuthor() == username) temp.add(post);
			}
			return temp;
		} catch (FirebaseException e) {
			Logger logger = Logger.getLogger(Firebase.class.getName());
			logger.log(Level.SEVERE, e.getMessage(), e);
			return null;
		}
		
		/*try {
			connectDatabase(URL, USER, PASSWORD);
			
			String query = "SELECT post.id, post.title, post.date, post.content "
					+ "FROM user JOIN post "
					+ "WHERE user.username = ? AND "
					+ "user.id = post.user_id AND "
					+ "post.published = ?";
			ArrayList<Post> posts = new ArrayList<Post>();
			
			statement = conn.prepareStatement(query);
			statement.setString(1, username);
			statement.setBoolean(2, published);
			statement.executeQuery();
			result = statement.getResultSet();
			
			while(result.next()) {
				Post post = new Post();
				post.setId(result.getInt(1));
				post.setAuthor(username);
				post.setTitle(result.getString(2));
				post.setDate(result.getDate(3));
				post.setContent(result.getString(4));
				post.setPublished(published);
				posts.add(post);
			}
			
			return posts;
		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(DriverManager.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
			return null;
		} finally {
			clearResult();
			clearStatement();
			disconnectDatabase();
		}
		*/
	}

	public Post getPost(int postId) {
		try {
			response = firebase.get("Post/" + postId);
			Map<String, Object> post = response.getBody();
			//Map.Entry<String, Object> entry = post.entrySet();
			Post temp = new Post();
			temp.setAuthor((String)post.get("author"));
			temp.setContent((String)post.get("content"));
			temp.setTitle((String)post.get("title"));
			temp.setPublished((boolean)post.get("published"));
			Date date = SimpleDateFormat.getInstance().parse(
						(String)post.get("date")
					);
			temp.setDate(date);
			/*for(Map.Entry<String, Object> entry : posts.entrySet()) {
				Post post = (Post)entry.getValue();
				if(post.getAuthor() == username) temp.add(post);
			}
			*/
			return temp;
		} catch (FirebaseException e) {
			Logger logger = Logger.getLogger(Firebase.class.getName());
			logger.log(Level.SEVERE, e.getMessage(), e);
			return null;
		} catch (Exception e) {
			return null;
		}
		/*
		try {
			connectDatabase(URL, USER, PASSWORD);
			
			String query =
				"SELECT post.id, post.title, post.date, post.content, user.username, post.published "
					+ "FROM user JOIN post "
					+ "WHERE post.id = ? ";
			
			statement = conn.prepareStatement(query);
			statement.setInt(1, postId);
			statement.executeQuery();
			result = statement.getResultSet();
			Post post = new Post();
			if (result.next()) {
				post.setId(result.getInt(1));
				post.setAuthor(result.getString(5));
				post.setTitle(result.getString(2));
				post.setDate(result.getDate(3));
				post.setContent(result.getString(4));
				post.setPublished(result.getBoolean(6));
			}
			
			return post;
		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(DriverManager.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
			return null;
		} finally {
			clearResult();
			clearStatement();
			disconnectDatabase();
		}
		*/
	}
	
	public void addPost(String username, String title, Date date, String content) {
		try {
			connectDatabase(URL, USER, PASSWORD);
			
			statement = conn.prepareStatement("SELECT id FROM user WHERE username = ?");
			statement.setString(1, username);
			result = statement.executeQuery();
			result.next();
			String userID = result.getString(1);
			
			String query = "INSERT INTO post (title, date, content, user_id, published) "
					+ "VALUES (?, ?, ?, ?, ?)";
			
			statement = conn.prepareStatement(query);
			statement.setString(1, title);
			statement.setDate(2, date);
			statement.setString(3, content);
			statement.setString(4, userID);
			statement.setBoolean(5, false);
			statement.executeUpdate();
		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(DriverManager.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		} finally {
			clearResult();
			clearStatement();
			disconnectDatabase();
		}
	}
	
	public void publishPost(int postId) {
		try {
			connectDatabase(URL, USER, PASSWORD);
			
			String query = "UPDATE post "
					+ "SET published=? "
					+ "WHERE id=? ";
			
			statement = conn.prepareStatement(query);
			statement.setBoolean(1, true);
			statement.setInt(2, postId);
			statement.executeUpdate();
			
		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(DriverManager.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		} finally {
			clearResult();
			clearStatement();
			disconnectDatabase();
		}
	}
	
	public void updatePost(int postId, String title, Date date, String content) {
		try {
			connectDatabase(URL, USER, PASSWORD);
			
			String query = "UPDATE post "
					+ "SET title=?, date=?, content=? "
					+"WHERE id = ? ";
			
			statement = conn.prepareStatement(query);
			statement.setString(1, title);
			statement.setDate(2, date);
			statement.setString(3, content);
			statement.setInt(4, postId);
			statement.executeUpdate();
			
		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(DriverManager.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		} finally {
			clearResult();
			clearStatement();
			disconnectDatabase();
		}
	}
	
	public void deletePost(int postId) {
		try {
			connectDatabase(URL, USER, PASSWORD);
			
			String query = "INSERT INTO deleted_posts SELECT * FROM post "
					+ "WHERE post.id = ? ";

			statement = conn.prepareStatement(query);
			statement.setInt(1, postId);
			statement.executeUpdate();
			
			query = "DELETE FROM post "
					+ "WHERE post.id = ? ";

			statement = conn.prepareStatement(query);
			statement.setInt(1, postId);
			statement.executeUpdate();

		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(DriverManager.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		} finally {
			clearResult();
			clearStatement();
			disconnectDatabase();
		}
	}
	
	public List<Post> getDeletedPosts(String username) {
		try {
			connectDatabase(URL, USER, PASSWORD);
			
			String query = "SELECT post.id, post.title, post.date, post.content, post.published "
					+ "FROM user, deleted_posts AS post "
					+ "WHERE user.username = ? AND "
					+ "user.id = post.user_id ";
			ArrayList<Post> posts = new ArrayList<Post>();
			
			statement = conn.prepareStatement(query);
			statement.setString(1, username);
			statement.executeQuery();
			result = statement.getResultSet();
			
			while(result.next()) {
				Post post = new Post();
				post.setId(result.getInt(1));
				post.setAuthor(username);
				post.setTitle(result.getString(2));
				post.setDate(result.getDate(3));
				post.setContent(result.getString(4));
				post.setPublished(result.getBoolean(5));
				posts.add(post);
			}
			
			return posts;
		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(DriverManager.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
			return null;
		} finally {
			clearResult();
			clearStatement();
			disconnectDatabase();
		}
	}

	public void undoDeletePost(int postId) {
		try {
			connectDatabase(URL, USER, PASSWORD);
			
			String query = "INSERT INTO post SELECT * FROM deleted_posts "
					+ "WHERE deleted_posts.id = ? ";

			statement = conn.prepareStatement(query);
			statement.setInt(1, postId);
			statement.executeUpdate();
			
			query = "DELETE FROM deleted_posts "
					+ "WHERE deleted_posts.id = ? ";

			statement = conn.prepareStatement(query);
			statement.setInt(1, postId);
			statement.executeUpdate();

		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(DriverManager.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		} finally {
			clearResult();
			clearStatement();
			disconnectDatabase();
		}
	}
	
	public void finalDeletePost(int postId) {
		try {
			connectDatabase(URL, USER, PASSWORD);
			
			String query = "DELETE FROM deleted_posts "
					+ "WHERE deleted_posts.id = ? ";

			statement = conn.prepareStatement(query);
			statement.setInt(1, postId);
			statement.executeUpdate();

		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(DriverManager.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		} finally {
			clearResult();
			clearStatement();
			disconnectDatabase();
		}
	}
	
	public ArrayList<Comment> getComments(int postId) {
		try {
			connectDatabase(URL, USER, PASSWORD);
			
			String query = "SELECT comment.sender, comment.date, comment.content "
					+ "FROM post JOIN comment ON post.id = comment.post_id "
					+ "WHERE post.id = ? ";
			ArrayList<Comment> comments = new ArrayList<Comment>();
			
			statement = conn.prepareStatement(query);
			statement.setInt(1, postId);
			statement.executeQuery();
			result = statement.getResultSet();
			
			while(result.next()) {
				Comment comment = new Comment();
				comment.setSender(result.getString(1));
				comment.setDate(result.getDate(2));
				comment.setContent(result.getString(3));
				comments.add(comment);
			}
			
			clearResult();
			clearStatement();
			disconnectDatabase();
			return comments;
		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(DriverManager.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
			return null;
		}
	}
	
	public void addComment(int postId, String sender, String email, Date date, String content) {
		try {
			connectDatabase(URL, USER, PASSWORD);
			
			String query = "INSERT INTO comment (sender, email, date, content, post_id) "
					+ "VALUES (?, ?, ?, ?, ?)";
			
			statement = conn.prepareStatement(query);
			statement.setString(1, sender);
			statement.setString(2, email);
			statement.setDate(3, date);
			statement.setString(4, content);
			statement.setInt(5, postId);
			statement.executeUpdate();
			
			clearResult();
			clearStatement();
			disconnectDatabase();
		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(DriverManager.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		}
	}
	
	/*
	public boolean validateUser(String username, String password) {
		try {
			connectDatabase(URL, USER, PASSWORD);
			
			boolean retval = false;
			String query = "SELECT user.username, user.password "
					+ "FROM user WHERE user.username = ?"
					+ "AND user.password = ?";
			statement = conn.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, password);
			statement.executeQuery();
			result = statement.getResultSet();
			if(result.first()) {
				retval = true;
			}
			
			clearResult();
			clearStatement();
			disconnectDatabase();
			return retval;
			
		} catch (SQLException ex) {
			return false;
		} 
	}
	*/
	
	public User getUserData(String username, String password) {
		try {
			connectDatabase(URL, USER, PASSWORD);
			
			User user = null;
			String query = "SELECT * "
					+ "FROM user WHERE user.username = ?"
					+ "AND user.password = ?";
			statement = conn.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, password);
			statement.executeQuery();
			result = statement.getResultSet();
			if(result.first()) {
				user = new User();
				user.setUsername(result.getString(1));
				user.setPassword(result.getString(2));
				user.setRole(result.getString(3));
			}
			
			clearResult();
			clearStatement();
			disconnectDatabase();
			return user;
		} catch (SQLException ex) {
			return null;
		} 
	}
	
	private void connectDatabase(String url, String user, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(DriverManager.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void disconnectDatabase() {
		try {
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(DriverManager.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		}
	}
	
	private void clearStatement() {
		try {
			if(statement != null) {
				statement.close();
			}
		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(PreparedStatement.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		}
	}
	
	private void clearResult() {
		try {
			if(result != null) {
				result.close();
			}
		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(ResultSet.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		}
	}
	
}
