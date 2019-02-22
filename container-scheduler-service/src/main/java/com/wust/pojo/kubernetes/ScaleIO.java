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
public class ScaleIO {

    private String gateway;
    private String system;
    private SecretRef secretRef;
    private boolean sslEnabled;
    private String protectionDomain;
    private String storagePool;
    private String storageMode;
    private String volumeName;
    private String fsType;
    private boolean readOnly;
    public void setGateway(String gateway) {
         this.gateway = gateway;
     }
     public String getGateway() {
         return gateway;
     }

    public void setSystem(String system) {
         this.system = system;
     }
     public String getSystem() {
         return system;
     }

    public void setSecretRef(SecretRef secretRef) {
         this.secretRef = secretRef;
     }
     public SecretRef getSecretRef() {
         return secretRef;
     }

    public void setSslEnabled(boolean sslEnabled) {
         this.sslEnabled = sslEnabled;
     }
     public boolean getSslEnabled() {
         return sslEnabled;
     }

    public void setProtectionDomain(String protectionDomain) {
         this.protectionDomain = protectionDomain;
     }
     public String getProtectionDomain() {
         return protectionDomain;
     }

    public void setStoragePool(String storagePool) {
         this.storagePool = storagePool;
     }
     public String getStoragePool() {
         return storagePool;
     }

    public void setStorageMode(String storageMode) {
         this.storageMode = storageMode;
     }
     public String getStorageMode() {
         return storageMode;
     }

    public void setVolumeName(String volumeName) {
         this.volumeName = volumeName;
     }
     public String getVolumeName() {
         return volumeName;
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

}