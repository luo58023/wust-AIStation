/**
  * Copyright 2018 bejson.com 
  */
package com.wust.pojo.kubernetes;

/**
 * Auto-generated: 2018-12-28 20:22:43
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Nfs {

    private String server;
    private String path;
    private boolean readOnly;
    public void setServer(String server) {
         this.server = server;
     }
     public String getServer() {
         return server;
     }

    public void setPath(String path) {
         this.path = path;
     }
     public String getPath() {
         return path;
     }

    public void setReadOnly(boolean readOnly) {
         this.readOnly = readOnly;
     }
     public boolean getReadOnly() {
         return readOnly;
     }

}