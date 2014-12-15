
/**
 * SimpleblogMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.wbd.www.simpleblog;

        /**
        *  SimpleblogMessageReceiverInOut message receiver
        */

        public class SimpleblogMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        SimpleblogSkeleton skel = (SimpleblogSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("search".equals(methodName)){
                
                org.wbd.www.simpleblog.SearchResponse searchResponse53 = null;
	                        org.wbd.www.simpleblog.Search wrappedParam =
                                                             (org.wbd.www.simpleblog.Search)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wbd.www.simpleblog.Search.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               searchResponse53 =
                                                   
                                                   
                                                         skel.search(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), searchResponse53, false, new javax.xml.namespace.QName("http://www.wbd.org/simpleblog/",
                                                    "search"));
                                    } else 

            if("editPost".equals(methodName)){
                
                org.wbd.www.simpleblog.EditPostResponse editPostResponse55 = null;
	                        org.wbd.www.simpleblog.EditPost wrappedParam =
                                                             (org.wbd.www.simpleblog.EditPost)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wbd.www.simpleblog.EditPost.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               editPostResponse55 =
                                                   
                                                   
                                                         skel.editPost(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), editPostResponse55, false, new javax.xml.namespace.QName("http://www.wbd.org/simpleblog/",
                                                    "editPost"));
                                    } else 

            if("publishPost".equals(methodName)){
                
                org.wbd.www.simpleblog.PublishPostResponse publishPostResponse57 = null;
	                        org.wbd.www.simpleblog.PublishPost wrappedParam =
                                                             (org.wbd.www.simpleblog.PublishPost)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wbd.www.simpleblog.PublishPost.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               publishPostResponse57 =
                                                   
                                                   
                                                         skel.publishPost(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), publishPostResponse57, false, new javax.xml.namespace.QName("http://www.wbd.org/simpleblog/",
                                                    "publishPost"));
                                    } else 

            if("deleteUser".equals(methodName)){
                
                org.wbd.www.simpleblog.DeleteUserResponse deleteUserResponse59 = null;
	                        org.wbd.www.simpleblog.DeleteUser wrappedParam =
                                                             (org.wbd.www.simpleblog.DeleteUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wbd.www.simpleblog.DeleteUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteUserResponse59 =
                                                   
                                                   
                                                         skel.deleteUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteUserResponse59, false, new javax.xml.namespace.QName("http://www.wbd.org/simpleblog/",
                                                    "deleteUser"));
                                    } else 

            if("listComment".equals(methodName)){
                
                org.wbd.www.simpleblog.ListCommentResponse listCommentResponse61 = null;
	                        org.wbd.www.simpleblog.ListComment wrappedParam =
                                                             (org.wbd.www.simpleblog.ListComment)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wbd.www.simpleblog.ListComment.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listCommentResponse61 =
                                                   
                                                   
                                                         skel.listComment(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listCommentResponse61, false, new javax.xml.namespace.QName("http://www.wbd.org/simpleblog/",
                                                    "listComment"));
                                    } else 

            if("listUser".equals(methodName)){
                
                org.wbd.www.simpleblog.ListUserResponse listUserResponse63 = null;
	                        org.wbd.www.simpleblog.ListUser wrappedParam =
                                                             (org.wbd.www.simpleblog.ListUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wbd.www.simpleblog.ListUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listUserResponse63 =
                                                   
                                                   
                                                         skel.listUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listUserResponse63, false, new javax.xml.namespace.QName("http://www.wbd.org/simpleblog/",
                                                    "listUser"));
                                    } else 

            if("addComment".equals(methodName)){
                
                org.wbd.www.simpleblog.AddCommentResponse addCommentResponse65 = null;
	                        org.wbd.www.simpleblog.AddComment wrappedParam =
                                                             (org.wbd.www.simpleblog.AddComment)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wbd.www.simpleblog.AddComment.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addCommentResponse65 =
                                                   
                                                   
                                                         skel.addComment(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addCommentResponse65, false, new javax.xml.namespace.QName("http://www.wbd.org/simpleblog/",
                                                    "addComment"));
                                    } else 

            if("deletePost".equals(methodName)){
                
                org.wbd.www.simpleblog.DeletePostResponse deletePostResponse67 = null;
	                        org.wbd.www.simpleblog.DeletePost wrappedParam =
                                                             (org.wbd.www.simpleblog.DeletePost)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wbd.www.simpleblog.DeletePost.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deletePostResponse67 =
                                                   
                                                   
                                                         skel.deletePost(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deletePostResponse67, false, new javax.xml.namespace.QName("http://www.wbd.org/simpleblog/",
                                                    "deletePost"));
                                    } else 

            if("addUser".equals(methodName)){
                
                org.wbd.www.simpleblog.AddUserResponse addUserResponse69 = null;
	                        org.wbd.www.simpleblog.AddUser wrappedParam =
                                                             (org.wbd.www.simpleblog.AddUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wbd.www.simpleblog.AddUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addUserResponse69 =
                                                   
                                                   
                                                         skel.addUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addUserResponse69, false, new javax.xml.namespace.QName("http://www.wbd.org/simpleblog/",
                                                    "addUser"));
                                    } else 

            if("deleteComment".equals(methodName)){
                
                org.wbd.www.simpleblog.DeleteCommentResponse deleteCommentResponse71 = null;
	                        org.wbd.www.simpleblog.DeleteComment wrappedParam =
                                                             (org.wbd.www.simpleblog.DeleteComment)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wbd.www.simpleblog.DeleteComment.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteCommentResponse71 =
                                                   
                                                   
                                                         skel.deleteComment(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteCommentResponse71, false, new javax.xml.namespace.QName("http://www.wbd.org/simpleblog/",
                                                    "deleteComment"));
                                    } else 

            if("editUser".equals(methodName)){
                
                org.wbd.www.simpleblog.EditUserResponse editUserResponse73 = null;
	                        org.wbd.www.simpleblog.EditUser wrappedParam =
                                                             (org.wbd.www.simpleblog.EditUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wbd.www.simpleblog.EditUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               editUserResponse73 =
                                                   
                                                   
                                                         skel.editUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), editUserResponse73, false, new javax.xml.namespace.QName("http://www.wbd.org/simpleblog/",
                                                    "editUser"));
                                    } else 

            if("addPost".equals(methodName)){
                
                org.wbd.www.simpleblog.AddPostResponse addPostResponse75 = null;
	                        org.wbd.www.simpleblog.AddPost wrappedParam =
                                                             (org.wbd.www.simpleblog.AddPost)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wbd.www.simpleblog.AddPost.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addPostResponse75 =
                                                   
                                                   
                                                         skel.addPost(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addPostResponse75, false, new javax.xml.namespace.QName("http://www.wbd.org/simpleblog/",
                                                    "addPost"));
                                    } else 

            if("listPost".equals(methodName)){
                
                org.wbd.www.simpleblog.ListPostResponse listPostResponse77 = null;
	                        org.wbd.www.simpleblog.ListPost wrappedParam =
                                                             (org.wbd.www.simpleblog.ListPost)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wbd.www.simpleblog.ListPost.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listPostResponse77 =
                                                   
                                                   
                                                         skel.listPost(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listPostResponse77, false, new javax.xml.namespace.QName("http://www.wbd.org/simpleblog/",
                                                    "listPost"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.Search param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.Search.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.SearchResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.SearchResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.EditPost param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.EditPost.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.EditPostResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.EditPostResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.PublishPost param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.PublishPost.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.PublishPostResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.PublishPostResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.DeleteUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.DeleteUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.DeleteUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.DeleteUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.ListComment param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.ListComment.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.ListCommentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.ListCommentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.ListUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.ListUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.ListUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.ListUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.AddComment param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.AddComment.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.AddCommentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.AddCommentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.DeletePost param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.DeletePost.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.DeletePostResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.DeletePostResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.AddUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.AddUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.AddUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.AddUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.DeleteComment param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.DeleteComment.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.DeleteCommentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.DeleteCommentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.EditUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.EditUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.EditUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.EditUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.AddPost param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.AddPost.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.AddPostResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.AddPostResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.ListPost param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.ListPost.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wbd.www.simpleblog.ListPostResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wbd.www.simpleblog.ListPostResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wbd.www.simpleblog.SearchResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wbd.www.simpleblog.SearchResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wbd.www.simpleblog.SearchResponse wrapsearch(){
                                org.wbd.www.simpleblog.SearchResponse wrappedElement = new org.wbd.www.simpleblog.SearchResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wbd.www.simpleblog.EditPostResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wbd.www.simpleblog.EditPostResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wbd.www.simpleblog.EditPostResponse wrapeditPost(){
                                org.wbd.www.simpleblog.EditPostResponse wrappedElement = new org.wbd.www.simpleblog.EditPostResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wbd.www.simpleblog.PublishPostResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wbd.www.simpleblog.PublishPostResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wbd.www.simpleblog.PublishPostResponse wrappublishPost(){
                                org.wbd.www.simpleblog.PublishPostResponse wrappedElement = new org.wbd.www.simpleblog.PublishPostResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wbd.www.simpleblog.DeleteUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wbd.www.simpleblog.DeleteUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wbd.www.simpleblog.DeleteUserResponse wrapdeleteUser(){
                                org.wbd.www.simpleblog.DeleteUserResponse wrappedElement = new org.wbd.www.simpleblog.DeleteUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wbd.www.simpleblog.ListCommentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wbd.www.simpleblog.ListCommentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wbd.www.simpleblog.ListCommentResponse wraplistComment(){
                                org.wbd.www.simpleblog.ListCommentResponse wrappedElement = new org.wbd.www.simpleblog.ListCommentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wbd.www.simpleblog.ListUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wbd.www.simpleblog.ListUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wbd.www.simpleblog.ListUserResponse wraplistUser(){
                                org.wbd.www.simpleblog.ListUserResponse wrappedElement = new org.wbd.www.simpleblog.ListUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wbd.www.simpleblog.AddCommentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wbd.www.simpleblog.AddCommentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wbd.www.simpleblog.AddCommentResponse wrapaddComment(){
                                org.wbd.www.simpleblog.AddCommentResponse wrappedElement = new org.wbd.www.simpleblog.AddCommentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wbd.www.simpleblog.DeletePostResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wbd.www.simpleblog.DeletePostResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wbd.www.simpleblog.DeletePostResponse wrapdeletePost(){
                                org.wbd.www.simpleblog.DeletePostResponse wrappedElement = new org.wbd.www.simpleblog.DeletePostResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wbd.www.simpleblog.AddUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wbd.www.simpleblog.AddUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wbd.www.simpleblog.AddUserResponse wrapaddUser(){
                                org.wbd.www.simpleblog.AddUserResponse wrappedElement = new org.wbd.www.simpleblog.AddUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wbd.www.simpleblog.DeleteCommentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wbd.www.simpleblog.DeleteCommentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wbd.www.simpleblog.DeleteCommentResponse wrapdeleteComment(){
                                org.wbd.www.simpleblog.DeleteCommentResponse wrappedElement = new org.wbd.www.simpleblog.DeleteCommentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wbd.www.simpleblog.EditUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wbd.www.simpleblog.EditUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wbd.www.simpleblog.EditUserResponse wrapeditUser(){
                                org.wbd.www.simpleblog.EditUserResponse wrappedElement = new org.wbd.www.simpleblog.EditUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wbd.www.simpleblog.AddPostResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wbd.www.simpleblog.AddPostResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wbd.www.simpleblog.AddPostResponse wrapaddPost(){
                                org.wbd.www.simpleblog.AddPostResponse wrappedElement = new org.wbd.www.simpleblog.AddPostResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wbd.www.simpleblog.ListPostResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wbd.www.simpleblog.ListPostResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wbd.www.simpleblog.ListPostResponse wraplistPost(){
                                org.wbd.www.simpleblog.ListPostResponse wrappedElement = new org.wbd.www.simpleblog.ListPostResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.wbd.www.simpleblog.Search.class.equals(type)){
                
                           return org.wbd.www.simpleblog.Search.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.SearchResponse.class.equals(type)){
                
                           return org.wbd.www.simpleblog.SearchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.EditPost.class.equals(type)){
                
                           return org.wbd.www.simpleblog.EditPost.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.EditPostResponse.class.equals(type)){
                
                           return org.wbd.www.simpleblog.EditPostResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.PublishPost.class.equals(type)){
                
                           return org.wbd.www.simpleblog.PublishPost.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.PublishPostResponse.class.equals(type)){
                
                           return org.wbd.www.simpleblog.PublishPostResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.DeleteUser.class.equals(type)){
                
                           return org.wbd.www.simpleblog.DeleteUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.DeleteUserResponse.class.equals(type)){
                
                           return org.wbd.www.simpleblog.DeleteUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.ListComment.class.equals(type)){
                
                           return org.wbd.www.simpleblog.ListComment.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.ListCommentResponse.class.equals(type)){
                
                           return org.wbd.www.simpleblog.ListCommentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.ListUser.class.equals(type)){
                
                           return org.wbd.www.simpleblog.ListUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.ListUserResponse.class.equals(type)){
                
                           return org.wbd.www.simpleblog.ListUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.AddComment.class.equals(type)){
                
                           return org.wbd.www.simpleblog.AddComment.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.AddCommentResponse.class.equals(type)){
                
                           return org.wbd.www.simpleblog.AddCommentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.DeletePost.class.equals(type)){
                
                           return org.wbd.www.simpleblog.DeletePost.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.DeletePostResponse.class.equals(type)){
                
                           return org.wbd.www.simpleblog.DeletePostResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.AddUser.class.equals(type)){
                
                           return org.wbd.www.simpleblog.AddUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.AddUserResponse.class.equals(type)){
                
                           return org.wbd.www.simpleblog.AddUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.DeleteComment.class.equals(type)){
                
                           return org.wbd.www.simpleblog.DeleteComment.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.DeleteCommentResponse.class.equals(type)){
                
                           return org.wbd.www.simpleblog.DeleteCommentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.EditUser.class.equals(type)){
                
                           return org.wbd.www.simpleblog.EditUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.EditUserResponse.class.equals(type)){
                
                           return org.wbd.www.simpleblog.EditUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.AddPost.class.equals(type)){
                
                           return org.wbd.www.simpleblog.AddPost.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.AddPostResponse.class.equals(type)){
                
                           return org.wbd.www.simpleblog.AddPostResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.ListPost.class.equals(type)){
                
                           return org.wbd.www.simpleblog.ListPost.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wbd.www.simpleblog.ListPostResponse.class.equals(type)){
                
                           return org.wbd.www.simpleblog.ListPostResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    