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
public class Sources {

    private Secret secret;
    private DownwardAPI downwardAPI;
    private ConfigMap configMap;
    private ServiceAccountToken serviceAccountToken;
    public void setSecret(Secret secret) {
         this.secret = secret;
     }
     public Secret getSecret() {
         return secret;
     }

    public void setDownwardAPI(DownwardAPI downwardAPI) {
         this.downwardAPI = downwardAPI;
     }
     public DownwardAPI getDownwardAPI() {
         return downwardAPI;
     }

    public void setConfigMap(ConfigMap configMap) {
         this.configMap = configMap;
     }
     public ConfigMap getConfigMap() {
         return configMap;
     }

    public void setServiceAccountToken(ServiceAccountToken serviceAccountToken) {
         this.serviceAccountToken = serviceAccountToken;
     }
     public ServiceAccountToken getServiceAccountToken() {
         return serviceAccountToken;
     }

}