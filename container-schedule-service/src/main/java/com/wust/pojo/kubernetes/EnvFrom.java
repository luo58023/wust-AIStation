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
public class EnvFrom {

    private String prefix;
    private ConfigMapRef configMapRef;
    private SecretRef secretRef;
    public void setPrefix(String prefix) {
         this.prefix = prefix;
     }
     public String getPrefix() {
         return prefix;
     }

    public void setConfigMapRef(ConfigMapRef configMapRef) {
         this.configMapRef = configMapRef;
     }
     public ConfigMapRef getConfigMapRef() {
         return configMapRef;
     }

    public void setSecretRef(SecretRef secretRef) {
         this.secretRef = secretRef;
     }
     public SecretRef getSecretRef() {
         return secretRef;
     }

}