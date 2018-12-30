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
public class AwsElasticBlockStore {

    private String volumeID;
    private String fsType;
    private int partition;
    private boolean readOnly;
    public void setVolumeID(String volumeID) {
         this.volumeID = volumeID;
     }
     public String getVolumeID() {
         return volumeID;
     }

    public void setFsType(String fsType) {
         this.fsType = fsType;
     }
     public String getFsType() {
         return fsType;
     }

    public void setPartition(int partition) {
         this.partition = partition;
     }
     public int getPartition() {
         return partition;
     }

    public void setReadOnly(boolean readOnly) {
         this.readOnly = readOnly;
     }
     public boolean getReadOnly() {
         return readOnly;
     }

}