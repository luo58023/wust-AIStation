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
public class Rbd {

    private List<String> monitors;
    private String image;
    private String fsType;
    private String pool;
    private String user;
    private String keyring;
    private SecretRef secretRef;
    private boolean readOnly;
    public void setMonitors(List<String> monitors) {
         this.monitors = monitors;
     }
     public List<String> getMonitors() {
         return monitors;
     }

    public void setImage(String image) {
         this.image = image;
     }
     public String getImage() {
         return image;
     }

    public void setFsType(String fsType) {
         this.fsType = fsType;
     }
     public String getFsType() {
         return fsType;
     }

    public void setPool(String pool) {
         this.pool = pool;
     }
     public String getPool() {
         return pool;
     }

    public void setUser(String user) {
         this.user = user;
     }
     public String getUser() {
         return user;
     }

    public void setKeyring(String keyring) {
         this.keyring = keyring;
     }
     public String getKeyring() {
         return keyring;
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

}