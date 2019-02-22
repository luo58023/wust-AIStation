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
public class Storageos {

    private String volumeName;
    private String volumeNamespace;
    private String fsType;
    private boolean readOnly;
    private SecretRef secretRef;
    public void setVolumeName(String volumeName) {
         this.volumeName = volumeName;
     }
     public String getVolumeName() {
         return volumeName;
     }

    public void setVolumeNamespace(String volumeNamespace) {
         this.volumeNamespace = volumeNamespace;
     }
     public String getVolumeNamespace() {
         return volumeNamespace;
     }

    public void setFsType(String fsType) {
         this.fsType = fsType;
     }
     public String getFsType() {
         return fsType;
     }

    public void setReadOnly(boolean readOnly) {
         this.readOnly = readOnly;
     }
     public boolean getReadOnly() {
         return readOnly;
     }

    public void setSecretRef(SecretRef secretRef) {
         this.secretRef = secretRef;
     }
     public SecretRef getSecretRef() {
         return secretRef;
     }

}