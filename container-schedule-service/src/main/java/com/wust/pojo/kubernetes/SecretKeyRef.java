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
public class SecretKeyRef {

    private String name;
    private String key;
    private boolean optional;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setKey(String key) {
         this.key = key;
     }
     public String getKey() {
         return key;
     }

    public void setOptional(boolean optional) {
         this.optional = optional;
     }
     public boolean getOptional() {
         return optional;
     }

}