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
public class ValueFrom {

    private FieldRef fieldRef;
    private ResourceFieldRef resourceFieldRef;
    private ConfigMapKeyRef configMapKeyRef;
    private SecretKeyRef secretKeyRef;
    public void setFieldRef(FieldRef fieldRef) {
         this.fieldRef = fieldRef;
     }
     public FieldRef getFieldRef() {
         return fieldRef;
     }

    public void setResourceFieldRef(ResourceFieldRef resourceFieldRef) {
         this.resourceFieldRef = resourceFieldRef;
     }
     public ResourceFieldRef getResourceFieldRef() {
         return resourceFieldRef;
     }

    public void setConfigMapKeyRef(ConfigMapKeyRef configMapKeyRef) {
         this.configMapKeyRef = configMapKeyRef;
     }
     public ConfigMapKeyRef getConfigMapKeyRef() {
         return configMapKeyRef;
     }

    public void setSecretKeyRef(SecretKeyRef secretKeyRef) {
         this.secretKeyRef = secretKeyRef;
     }
     public SecretKeyRef getSecretKeyRef() {
         return secretKeyRef;
     }

}