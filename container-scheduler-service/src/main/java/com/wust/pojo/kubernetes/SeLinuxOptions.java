/**
  * Copyright 2019 bejson.com 
  */
package com.wust.pojo.kubernetes;

/**
 * Auto-generated: 2019-02-20 21:8:53
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class SeLinuxOptions {

    private String user;
    private String role;
    private String type;
    private String level;
    public void setUser(String user) {
         this.user = user;
     }
     public String getUser() {
         return user;
     }

    public void setRole(String role) {
         this.role = role;
     }
     public String getRole() {
         return role;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setLevel(String level) {
         this.level = level;
     }
     public String getLevel() {
         return level;
     }

}