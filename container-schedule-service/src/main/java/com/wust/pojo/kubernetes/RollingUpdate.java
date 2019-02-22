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
public class RollingUpdate {

    private String maxUnavailable;
    private String maxSurge;
    public void setMaxUnavailable(String maxUnavailable) {
         this.maxUnavailable = maxUnavailable;
     }
     public String getMaxUnavailable() {
         return maxUnavailable;
     }

    public void setMaxSurge(String maxSurge) {
         this.maxSurge = maxSurge;
     }
     public String getMaxSurge() {
         return maxSurge;
     }

}