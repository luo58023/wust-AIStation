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
public class ConfigMapRef {

    private String name;
    private boolean optional;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setOptional(boolean optional) {
         this.optional = optional;
     }
     public boolean getOptional() {
         return optional;
     }

}