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
public class OwnerReferences {

    private String apiVersion;
    private String kind;
    private String name;
    private String uid;
    private boolean controller;
    private boolean blockOwnerDeletion;
    public void setApiVersion(String apiVersion) {
         this.apiVersion = apiVersion;
     }
     public String getApiVersion() {
         return apiVersion;
     }

    public void setKind(String kind) {
         this.kind = kind;
     }
     public String getKind() {
         return kind;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setUid(String uid) {
         this.uid = uid;
     }
     public String getUid() {
         return uid;
     }

    public void setController(boolean controller) {
         this.controller = controller;
     }
     public boolean getController() {
         return controller;
     }

    public void setBlockOwnerDeletion(boolean blockOwnerDeletion) {
         this.blockOwnerDeletion = blockOwnerDeletion;
     }
     public boolean getBlockOwnerDeletion() {
         return blockOwnerDeletion;
     }

}