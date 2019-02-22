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
public class Conditions {

    private String type;
    private String status;
    private String lastUpdateTime;
    private String lastTransitionTime;
    private String reason;
    private String message;
    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setLastUpdateTime(String lastUpdateTime) {
         this.lastUpdateTime = lastUpdateTime;
     }
     public String getLastUpdateTime() {
         return lastUpdateTime;
     }

    public void setLastTransitionTime(String lastTransitionTime) {
         this.lastTransitionTime = lastTransitionTime;
     }
     public String getLastTransitionTime() {
         return lastTransitionTime;
     }

    public void setReason(String reason) {
         this.reason = reason;
     }
     public String getReason() {
         return reason;
     }

    public void setMessage(String message) {
         this.message = message;
     }
     public String getMessage() {
         return message;
     }

}