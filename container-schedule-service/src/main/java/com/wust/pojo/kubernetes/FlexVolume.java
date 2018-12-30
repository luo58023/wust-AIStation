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
public class FlexVolume {

    private String driver;
    private String fsType;
    private SecretRef secretRef;
    private boolean readOnly;
    private String options;
    public void setDriver(String driver) {
         this.driver = driver;
     }
     public String getDriver() {
         return driver;
     }

    public void setFsType(String fsType) {
         this.fsType = fsType;
     }
     public String getFsType() {
         return fsType;
     }

    public void setSecretRef(SecretRef secretRef) {
         this.secretRef = secretRef;
     }
     public SecretRef getSecretRef() {
         return secretRef;
     }

    public void setReadOnly(boolean readOnly) {
         this.readOnly = readOnly;
     }
     public boolean getReadOnly() {
         return readOnly;
     }

    public void setOptions(String options) {
         this.options = options;
     }
     public String getOptions() {
         return options;
     }

}