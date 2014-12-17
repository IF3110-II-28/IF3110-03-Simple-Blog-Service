/**
 * SimpleblogSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package org.wbd.www.simpleblog;

import java.net.URI;
import java.util.Calendar;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 * SimpleblogSkeleton java skeleton for the axisService
 */
public class SimpleblogSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param search
	 * @return searchResponse
	 * @throws Exception 
	 */

	public org.wbd.www.simpleblog.SearchResponse search(
			org.wbd.www.simpleblog.Search search) throws Exception {

		org.wbd.www.simpleblog.SearchResponse response = new org.wbd.www.simpleblog.SearchResponse();
		ArrayOfPosts posts = new ArrayOfPosts();
		String searchTerm = search.getQuery().toLowerCase();

		URI uri = new URIBuilder()
				.setScheme("https")
				.setHost("wbd-simpleblog-28.firebaseio.com")
				.setPath("/posts.json")
				.build();
		HttpGet httpget = new HttpGet(uri);
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			System.out.println("Communicating with " + httpget.getURI() + " ...");
			CloseableHttpResponse httpresponse = httpclient.execute(httpget);
			StatusLine statusLine = httpresponse.getStatusLine();
			System.out.println(statusLine);
			if (statusLine.getStatusCode() == 200) {
				HttpEntity entity = httpresponse.getEntity();
				if (entity != null) {
					JSONObject obj = (JSONObject) JSONValue.parse(EntityUtils.toString(entity));
					@SuppressWarnings("unchecked")
					Map<String, Object> listposts = (Map<String, Object>) obj;
					for (Map.Entry<String, Object> e : listposts.entrySet()) {
						JSONObject post = (JSONObject) e.getValue();

						Blogpost newpost = new Blogpost();
						newpost.setId(e.getKey());
						newpost.setJudul((String) post.get("judul"));
						
						Calendar tanggal = Calendar.getInstance();
						tanggal.setTimeInMillis((Long) post.get("tanggal"));
						newpost.setTanggal(tanggal);
						
						newpost.setKonten((String) post.get("konten"));
						newpost.setIsPublished((boolean) post.get("isPublished"));

						if (newpost.getJudul().toLowerCase().contains(searchTerm)
								|| newpost.getKonten().toLowerCase().contains(searchTerm)) {
							posts.addBlogpost(newpost);
						}
					}
				}
			} else {
				throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
			}
		} finally {
			httpclient.close();
		}

		response.setResult(posts);
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param editPost
	 * @return editPostResponse
	 * @throws Exception
	 */

	@SuppressWarnings("unchecked")
	public org.wbd.www.simpleblog.EditPostResponse editPost(
			org.wbd.www.simpleblog.EditPost editPost) throws Exception {
		org.wbd.www.simpleblog.EditPostResponse response = new org.wbd.www.simpleblog.EditPostResponse();

		JSONObject paramsObj = new JSONObject();
		paramsObj.put("judul", editPost.getJudul());
		paramsObj.put("tanggal", editPost.getTanggal().getTimeInMillis());
		paramsObj.put("konten", editPost.getKonten());

		URI uri = new URIBuilder()
			.setScheme("https")
			.setHost("wbd-simpleblog-28.firebaseio.com")
			.setPath("/posts/" + editPost.getId() + ".json")
			.build();
		HttpPatch httppatch = new HttpPatch(uri);
		httppatch.setEntity(new StringEntity(paramsObj.toString()));
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			System.out.println("Communicating with " + httppatch.getURI() + " ...");
			CloseableHttpResponse httpresponse = httpclient.execute(httppatch);
			System.out.println(httpresponse.getStatusLine());
			if (httpresponse.getStatusLine().getStatusCode() == 200) {
				response.setSuccess(true);
			} else {
				response.setSuccess(false);
			}
		} finally {
			httpclient.close();
		}

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param publishPost
	 * @return publishPostResponse
	 * @throws Exception 
	 */

	@SuppressWarnings("unchecked")
	public org.wbd.www.simpleblog.PublishPostResponse publishPost(
			org.wbd.www.simpleblog.PublishPost publishPost) throws Exception {
		org.wbd.www.simpleblog.PublishPostResponse response = new org.wbd.www.simpleblog.PublishPostResponse();

		JSONObject paramsObj = new JSONObject();
		paramsObj.put("isPublished", true);

		URI uri = new URIBuilder()
			.setScheme("https")
			.setHost("wbd-simpleblog-28.firebaseio.com")
			.setPath("/posts/" + publishPost.getId() + ".json")
			.build();
		HttpPatch httppatch = new HttpPatch(uri);
		httppatch.setEntity(new StringEntity(paramsObj.toString()));
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			System.out.println("Communicating with " + httppatch.getURI() + " ...");
			CloseableHttpResponse httpresponse = httpclient.execute(httppatch);
			System.out.println(httpresponse.getStatusLine());
			if (httpresponse.getStatusLine().getStatusCode() == 200) {
				response.setSuccess(true);
			} else {
				response.setSuccess(false);
			}
		} finally {
			httpclient.close();
		}

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param deleteUser
	 * @return deleteUserResponse
	 * @throws Exception 
	 */

	public org.wbd.www.simpleblog.DeleteUserResponse deleteUser(
			org.wbd.www.simpleblog.DeleteUser deleteUser) throws Exception {
		org.wbd.www.simpleblog.DeleteUserResponse response = new org.wbd.www.simpleblog.DeleteUserResponse();

		URI uri = new URIBuilder()
			.setScheme("https")
			.setHost("wbd-simpleblog-28.firebaseio.com")
			.setPath("/users/" + deleteUser.getId() + ".json")
			.build();
		HttpDelete httpdelete = new HttpDelete(uri);
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			System.out.println("Communicating with " + httpdelete.getURI() + " ...");
			CloseableHttpResponse httpresponse = httpclient.execute(httpdelete);
			System.out.println(httpresponse.getStatusLine());
			if (httpresponse.getStatusLine().getStatusCode() == 200) {
				response.setSuccess(true);
			} else {
				response.setSuccess(false);
			}
		} finally {
			httpclient.close();
		}

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param listComment
	 * @return listCommentResponse
	 * @throws Exception 
	 */

	public org.wbd.www.simpleblog.ListCommentResponse listComment(
			org.wbd.www.simpleblog.ListComment listComment) throws Exception {

		org.wbd.www.simpleblog.ListCommentResponse response = new org.wbd.www.simpleblog.ListCommentResponse();
		ArrayOfComments comments = new ArrayOfComments();

		URI uri = new URIBuilder()
				.setScheme("https")
				.setHost("wbd-simpleblog-28.firebaseio.com")
				.setPath("/posts/" + listComment.getPostId() + "/comments.json")
				.build();
		HttpGet httpget = new HttpGet(uri);
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			System.out.println("Communicating with " + httpget.getURI() + " ...");
			CloseableHttpResponse httpresponse = httpclient.execute(httpget);
			StatusLine statusLine = httpresponse.getStatusLine();
			System.out.println(statusLine);
			if (statusLine.getStatusCode() == 200) {
				HttpEntity responseBody = httpresponse.getEntity();
				if (responseBody != null) {
					JSONObject obj = (JSONObject) JSONValue.parse(EntityUtils.toString(responseBody));
					@SuppressWarnings("unchecked")
					Map<String, Object> listcomments = (Map<String, Object>) obj;
					for (Map.Entry<String, Object> e : listcomments.entrySet()) {
						JSONObject comment = (JSONObject) e.getValue();

						Komentar newcomment = new Komentar();
						newcomment.setId(e.getKey());
						newcomment.setNama((String) comment.get("nama"));
						newcomment.setEmail((String) comment.get("email"));
						
						Calendar tanggal = Calendar.getInstance();
						tanggal.setTimeInMillis((Long) comment.get("tanggal"));
						newcomment.setTanggal(tanggal);
						
						newcomment.setKonten((String) comment.get("konten"));

						comments.addKomentar(newcomment);
					}
				}
			} else {
				throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
			}
		} finally {
			httpclient.close();
		}

		response.setComments(comments);
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param listUser
	 * @return listUserResponse
	 * @throws Exception 
	 */

	public org.wbd.www.simpleblog.ListUserResponse listUser(
			org.wbd.www.simpleblog.ListUser listUser) throws Exception {

		org.wbd.www.simpleblog.ListUserResponse response = new org.wbd.www.simpleblog.ListUserResponse();
		ArrayOfUsers users = new ArrayOfUsers();

		URI uri = new URIBuilder()
				.setScheme("https")
				.setHost("wbd-simpleblog-28.firebaseio.com")
				.setPath("/users.json")
				.build();
		HttpGet httpget = new HttpGet(uri);
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			System.out.println("Communicating with " + httpget.getURI() + " ...");
			CloseableHttpResponse httpresponse = httpclient.execute(httpget);
			StatusLine statusLine = httpresponse.getStatusLine();
			System.out.println(statusLine);
			if (statusLine.getStatusCode() == 200) {
				HttpEntity responseBody = httpresponse.getEntity();
				if (responseBody != null) {
					JSONObject obj = (JSONObject) JSONValue.parse(EntityUtils.toString(responseBody));
					@SuppressWarnings("unchecked")
					Map<String, Object> listusers = (Map<String, Object>) obj;
					for (Map.Entry<String, Object> e : listusers.entrySet()) {
						JSONObject user = (JSONObject) e.getValue();

						User newuser = new User();
						newuser.setId(e.getKey());
						newuser.setUsername((String) user.get("username"));
						newuser.setPassword((String) user.get("password"));
						newuser.setRole((String) user.get("role"));

						users.addUser(newuser);
					}
				}
			} else {
				throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
			}
		} finally {
			httpclient.close();
		}

		response.setUsers(users);
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addComment
	 * @return addCommentResponse
	 * @throws Exception 
	 */

	@SuppressWarnings("unchecked")
	public org.wbd.www.simpleblog.AddCommentResponse addComment(
			org.wbd.www.simpleblog.AddComment addComment) throws Exception {
		org.wbd.www.simpleblog.AddCommentResponse response = new org.wbd.www.simpleblog.AddCommentResponse();

		JSONObject paramsObj = new JSONObject();
		paramsObj.put("nama", addComment.getNama());
		paramsObj.put("email", addComment.getEmail());
		paramsObj.put("tanggal", addComment.getTanggal().getTimeInMillis());
		paramsObj.put("konten", addComment.getKonten());

		URI uri = new URIBuilder()
			.setScheme("https")
			.setHost("wbd-simpleblog-28.firebaseio.com")
			.setPath("/posts/" + addComment.getPostId() + "/comments.json")
			.build();
		HttpPost httppost = new HttpPost(uri);
		httppost.setEntity(new StringEntity(paramsObj.toString()));
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			System.out.println("Communicating with " + httppost.getURI() + " ...");
			CloseableHttpResponse httpresponse = httpclient.execute(httppost);
			System.out.println(httpresponse.getStatusLine());
			if (httpresponse.getStatusLine().getStatusCode() == 200) {
				response.setSuccess(true);
			} else {
				response.setSuccess(false);
			}
		} finally {
			httpclient.close();
		}

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param deletePost
	 * @return deletePostResponse
	 * @throws Exception 
	 */

	public org.wbd.www.simpleblog.DeletePostResponse deletePost(
			org.wbd.www.simpleblog.DeletePost deletePost) throws Exception {
		org.wbd.www.simpleblog.DeletePostResponse response = new org.wbd.www.simpleblog.DeletePostResponse();

		URI uri = new URIBuilder()
			.setScheme("https")
			.setHost("wbd-simpleblog-28.firebaseio.com")
			.setPath("/posts/" + deletePost.getId() + ".json")
			.build();
		HttpDelete httpdelete = new HttpDelete(uri);
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			System.out.println("Communicating with " + httpdelete.getURI() + " ...");
			CloseableHttpResponse httpresponse = httpclient.execute(httpdelete);
			System.out.println(httpresponse.getStatusLine());
			if (httpresponse.getStatusLine().getStatusCode() == 200) {
				response.setSuccess(true);
			} else {
				response.setSuccess(false);
			}
		} finally {
			httpclient.close();
		}

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addUser
	 * @return addUserResponse
	 * @throws Exception 
	 */

	@SuppressWarnings("unchecked")
	public org.wbd.www.simpleblog.AddUserResponse addUser(
			org.wbd.www.simpleblog.AddUser addUser) throws Exception {
		org.wbd.www.simpleblog.AddUserResponse response = new org.wbd.www.simpleblog.AddUserResponse();

		JSONObject paramsObj = new JSONObject();
		paramsObj.put("username", addUser.getUsername());
		paramsObj.put("password", addUser.getPassword());
		paramsObj.put("role", addUser.getRole());

		URI uri = new URIBuilder()
			.setScheme("https")
			.setHost("wbd-simpleblog-28.firebaseio.com")
			.setPath("/users.json")
			.build();
		HttpPost httppost = new HttpPost(uri);
		httppost.setEntity(new StringEntity(paramsObj.toString()));
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			System.out.println("Communicating with " + httppost.getURI() + " ...");
			CloseableHttpResponse httpresponse = httpclient.execute(httppost);
			System.out.println(httpresponse.getStatusLine());
			if (httpresponse.getStatusLine().getStatusCode() == 200) {
				response.setSuccess(true);
			} else {
				response.setSuccess(false);
			}
		} finally {
			httpclient.close();
		}

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param deleteComment
	 * @return deleteCommentResponse
	 * @throws Exception 
	 */

	public org.wbd.www.simpleblog.DeleteCommentResponse deleteComment(
			org.wbd.www.simpleblog.DeleteComment deleteComment) throws Exception {
		org.wbd.www.simpleblog.DeleteCommentResponse response = new org.wbd.www.simpleblog.DeleteCommentResponse();

		URI uri = new URIBuilder()
			.setScheme("https")
			.setHost("wbd-simpleblog-28.firebaseio.com")
			.setPath("/posts/" + deleteComment.getPostId() + "/comments/" + deleteComment.getId() + ".json")
			.build();
		HttpDelete httpdelete = new HttpDelete(uri);
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			System.out.println("Communicating with " + httpdelete.getURI() + " ...");
			CloseableHttpResponse httpresponse = httpclient.execute(httpdelete);
			System.out.println(httpresponse.getStatusLine());
			if (httpresponse.getStatusLine().getStatusCode() == 200) {
				response.setSuccess(true);
			} else {
				response.setSuccess(false);
			}
		} finally {
			httpclient.close();
		}

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param editUser
	 * @return editUserResponse
	 * @throws Exception 
	 */

	@SuppressWarnings("unchecked")
	public org.wbd.www.simpleblog.EditUserResponse editUser(
			org.wbd.www.simpleblog.EditUser editUser) throws Exception {
		org.wbd.www.simpleblog.EditUserResponse response = new org.wbd.www.simpleblog.EditUserResponse();

		JSONObject paramsObj = new JSONObject();
		paramsObj.put("username", editUser.getUsername());
		paramsObj.put("password", editUser.getPassword());
		paramsObj.put("role", editUser.getRole());

		URI uri = new URIBuilder()
			.setScheme("https")
			.setHost("wbd-simpleblog-28.firebaseio.com")
			.setPath("/users/" + editUser.getId() + ".json")
			.build();
		HttpPatch httppatch = new HttpPatch(uri);
		httppatch.setEntity(new StringEntity(paramsObj.toString()));
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			System.out.println("Communicating with " + httppatch.getURI() + " ...");
			CloseableHttpResponse httpresponse = httpclient.execute(httppatch);
			System.out.println(httpresponse.getStatusLine());
			if (httpresponse.getStatusLine().getStatusCode() == 200) {
				response.setSuccess(true);
			} else {
				response.setSuccess(false);
			}
		} finally {
			httpclient.close();
		}

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addPost
	 * @return addPostResponse
	 * @throws Exception 
	 */

	@SuppressWarnings("unchecked")
	public org.wbd.www.simpleblog.AddPostResponse addPost(
			org.wbd.www.simpleblog.AddPost addPost) throws Exception {
		org.wbd.www.simpleblog.AddPostResponse response = new org.wbd.www.simpleblog.AddPostResponse();

		JSONObject paramsObj = new JSONObject();
		paramsObj.put("judul", addPost.getJudul());
		paramsObj.put("tanggal", addPost.getTanggal().getTimeInMillis());
		paramsObj.put("konten", addPost.getKonten());
		paramsObj.put("isPublished", false);

		URI uri = new URIBuilder()
			.setScheme("https")
			.setHost("wbd-simpleblog-28.firebaseio.com")
			.setPath("/posts.json")
			.build();
		HttpPost httppost = new HttpPost(uri);
		StringEntity se = new StringEntity(paramsObj.toString());
		httppost.setEntity(se);
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			System.out.println("Communicating with " + httppost.getURI() + " ...");
			CloseableHttpResponse httpresponse = httpclient.execute(httppost);
			System.out.println(httpresponse.getStatusLine());
			if (httpresponse.getStatusLine().getStatusCode() == 200) {
				response.setSuccess(true);
			} else {
				response.setSuccess(false);
			}
		} finally {
			httpclient.close();
		}

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param listPost
	 * @return listPostResponse
	 * @throws Exception 
	 */

	public org.wbd.www.simpleblog.ListPostResponse listPost(
			org.wbd.www.simpleblog.ListPost listPost) throws Exception {

		org.wbd.www.simpleblog.ListPostResponse response = new org.wbd.www.simpleblog.ListPostResponse();
		ArrayOfPosts posts = new ArrayOfPosts();

		URI uri = new URIBuilder().setScheme("https")
				.setHost("wbd-simpleblog-28.firebaseio.com")
				.setPath("/posts.json").build();
		HttpGet httpget = new HttpGet(uri);
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			System.out.println("Communicating with " + httpget.getURI() + " ...");
			CloseableHttpResponse httpresponse = httpclient.execute(httpget);
			StatusLine statusLine = httpresponse.getStatusLine();
			System.out.println(statusLine);
			if (statusLine.getStatusCode() == 200) {
				String responseBody = EntityUtils.toString(httpresponse.getEntity());
				if (responseBody != null) {
					JSONObject obj = (JSONObject) JSONValue.parse(responseBody);
					@SuppressWarnings("unchecked")
					Map<String, Object> listposts = (Map<String, Object>) obj;
					for (Map.Entry<String, Object> e : listposts.entrySet()) {
						JSONObject post = (JSONObject) e.getValue();

						Blogpost newpost = new Blogpost();
						newpost.setId(e.getKey());
						newpost.setJudul((String) post.get("judul"));
						
						Calendar tanggal = Calendar.getInstance();
						tanggal.setTimeInMillis((Long) post.get("tanggal"));
						newpost.setTanggal(tanggal);
						
						newpost.setKonten((String) post.get("konten"));
						newpost.setIsPublished((boolean) post.get("isPublished"));

						posts.addBlogpost(newpost);
					}
				}
			} else {
				throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
			}
		} finally {
			httpclient.close();
		}

		response.setPosts(posts);
		return response;
	}

}
