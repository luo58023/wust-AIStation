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
public class Resources {

    private String limits;
    private String requests;
    public void setLimits(String limits) {
         this.limits = limits;
     }
     public String getLimits() {
         return limits;
     }

    public void setRequests(String requests) {
         this.requests = requests;
     }
     public String getRequests() {
         return requests;
     }

}