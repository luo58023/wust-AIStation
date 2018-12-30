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
public class Result {

    private String kind;
    private String apiVersion;
    private Metadata metadata;
    private String status;
    private String message;
    private String reason;
    private Details details;
    private int code;
    public void setKind(String kind) {
         this.kind = kind;
     }
     public String getKind() {
         return kind;
     }

    public void setApiVersion(String apiVersion) {
         this.apiVersion = apiVersion;
     }
     public String getApiVersion() {
         return apiVersion;
     }

    public void setMetadata(Metadata metadata) {
         this.metadata = metadata;
     }
     public Metadata getMetadata() {
         return metadata;
     }

    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setMessage(String message) {
         this.message = message;
     }
     public String getMessage() {
         return message;
     }

    public void setReason(String reason) {
         this.reason = reason;
     }
     public String getReason() {
         return reason;
     }

    public void setDetails(Details details) {
         this.details = details;
     }
     public Details getDetails() {
         return details;
     }

    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

}