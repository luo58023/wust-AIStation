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
public class AzureFile {

    private String secretName;
    private String shareName;
    private boolean readOnly;
    public void setSecretName(String secretName) {
         this.secretName = secretName;
     }
     public String getSecretName() {
         return secretName;
     }

    public void setShareName(String shareName) {
         this.shareName = shareName;
     }
     public String getShareName() {
         return shareName;
     }

    public void setReadOnly(boolean readOnly) {
         this.readOnly = readOnly;
     }
     public boolean getReadOnly() {
         return readOnly;
     }

}