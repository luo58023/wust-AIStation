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
public class ServiceAccountToken {

    private String audience;
    private int expirationSeconds;
    private String path;
    public void setAudience(String audience) {
         this.audience = audience;
     }
     public String getAudience() {
         return audience;
     }

    public void setExpirationSeconds(int expirationSeconds) {
         this.expirationSeconds = expirationSeconds;
     }
     public int getExpirationSeconds() {
         return expirationSeconds;
     }

    public void setPath(String path) {
         this.path = path;
     }
     public String getPath() {
         return path;
     }

}