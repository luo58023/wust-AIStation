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
public class VsphereVolume {

    private String volumePath;
    private String fsType;
    private String storagePolicyName;
    private String storagePolicyID;
    public void setVolumePath(String volumePath) {
         this.volumePath = volumePath;
     }
     public String getVolumePath() {
         return volumePath;
     }

    public void setFsType(String fsType) {
         this.fsType = fsType;
     }
     public String getFsType() {
         return fsType;
     }

    public void setStoragePolicyName(String storagePolicyName) {
         this.storagePolicyName = storagePolicyName;
     }
     public String getStoragePolicyName() {
         return storagePolicyName;
     }

    public void setStoragePolicyID(String storagePolicyID) {
         this.storagePolicyID = storagePolicyID;
     }
     public String getStoragePolicyID() {
         return storagePolicyID;
     }

}