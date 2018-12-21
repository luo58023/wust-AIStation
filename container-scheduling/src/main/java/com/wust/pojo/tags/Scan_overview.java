/**
  * Copyright 2018 bejson.com 
  */
package com.wust.pojo.tags;

/**
 * Auto-generated: 2018-12-20 21:58:9
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Scan_overview {

    private String digest;
    private String scan_status;
    private int job_id;
    private int severity;
    private String details_key;
    private Components components;
    public void setDigest(String digest) {
         this.digest = digest;
     }
     public String getDigest() {
         return digest;
     }

    public void setScan_status(String scan_status) {
         this.scan_status = scan_status;
     }
     public String getScan_status() {
         return scan_status;
     }

    public void setJob_id(int job_id) {
         this.job_id = job_id;
     }
     public int getJob_id() {
         return job_id;
     }

    public void setSeverity(int severity) {
         this.severity = severity;
     }
     public int getSeverity() {
         return severity;
     }

    public void setDetails_key(String details_key) {
         this.details_key = details_key;
     }
     public String getDetails_key() {
         return details_key;
     }

    public void setComponents(Components components) {
         this.components = components;
     }
     public Components getComponents() {
         return components;
     }

}