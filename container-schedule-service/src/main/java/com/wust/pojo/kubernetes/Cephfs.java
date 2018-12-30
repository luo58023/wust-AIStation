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
public class Cephfs {

    private List<String> monitors;
    private String path;
    private String user;
    private String secretFile;
    private SecretRef secretRef;
    private boolean readOnly;
    public void setMonitors(List<String> monitors) {
         this.monitors = monitors;
     }
     public List<String> getMonitors() {
         return monitors;
     }

    public void setPath(String path) {
         this.path = path;
     }
     public String getPath() {
         return path;
     }

    public void setUser(String user) {
         this.user = user;
     }
     public String getUser() {
         return user;
     }

    public void setSecretFile(String secretFile) {
         this.secretFile = secretFile;
     }
     public String getSecretFile() {
         return secretFile;
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