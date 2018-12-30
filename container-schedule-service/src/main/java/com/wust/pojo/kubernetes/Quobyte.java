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
public class Quobyte {

    private String registry;
    private String volume;
    private boolean readOnly;
    private String user;
    private String group;
    public void setRegistry(String registry) {
         this.registry = registry;
     }
     public String getRegistry() {
         return registry;
     }

    public void setVolume(String volume) {
         this.volume = volume;
     }
     public String getVolume() {
         return volume;
     }

    public void setReadOnly(boolean readOnly) {
         this.readOnly = readOnly;
     }
     public boolean getReadOnly() {
         return readOnly;
     }

    public void setUser(String user) {
         this.user = user;
     }
     public String getUser() {
         return user;
     }

    public void setGroup(String group) {
         this.group = group;
     }
     public String getGroup() {
         return group;
     }

}