
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package org.wbd.www.simpleblog;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.wbd.org/simpleblog/".equals(namespaceURI) &&
                  "User".equals(typeName)){
                   
                            return  org.wbd.www.simpleblog.User.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.wbd.org/simpleblog/".equals(namespaceURI) &&
                  "Blogpost".equals(typeName)){
                   
                            return  org.wbd.www.simpleblog.Blogpost.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.wbd.org/simpleblog/".equals(namespaceURI) &&
                  "ArrayOfPosts".equals(typeName)){
                   
                            return  org.wbd.www.simpleblog.ArrayOfPosts.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.wbd.org/simpleblog/".equals(namespaceURI) &&
                  "ArrayOfUsers".equals(typeName)){
                   
                            return  org.wbd.www.simpleblog.ArrayOfUsers.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.wbd.org/simpleblog/".equals(namespaceURI) &&
                  "ArrayOfComments".equals(typeName)){
                   
                            return  org.wbd.www.simpleblog.ArrayOfComments.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.wbd.org/simpleblog/".equals(namespaceURI) &&
                  "Komentar".equals(typeName)){
                   
                            return  org.wbd.www.simpleblog.Komentar.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    