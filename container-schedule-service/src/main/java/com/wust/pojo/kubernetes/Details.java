/**
  * Copyright 2018 bejson.com 
  */
package com.wust.pojo.kubernetes;
import java.util.List;

/**
 * Auto-generated: 2018-12-28 20:22:43
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Details {

    private String name;
    private String group;
    private String kind;
    private String uid;
    private List<Causes> causes;
    private int retryAfterSeconds;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setGroup(String group) {
         this.group = group;
     }
     public String getGroup() {
         return group;
     }

    public void setKind(String kind) {
         this.kind = kind;
     }
     public String getKind() {
         return kind;
     }

    public void setUid(String uid) {
         this.uid = uid;
     }
     public String getUid() {
         return uid;
     }

    public void setCauses(List<Causes> causes) {
         this.causes = causes;
     }
     public List<Causes> getCauses() {
         return causes;
     }

    public void setRetryAfterSeconds(int retryAfterSeconds) {
         this.retryAfterSeconds = retryAfterSeconds;
     }
     public int getRetryAfterSeconds() {
         return retryAfterSeconds;
     }

}