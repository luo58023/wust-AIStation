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
public class Tolerations {

    private String key;
    private String operator;
    private String value;
    private String effect;
    private int tolerationSeconds;
    public void setKey(String key) {
         this.key = key;
     }
     public String getKey() {
         return key;
     }

    public void setOperator(String operator) {
         this.operator = operator;
     }
     public String getOperator() {
         return operator;
     }

    public void setValue(String value) {
         this.value = value;
     }
     public String getValue() {
         return value;
     }

    public void setEffect(String effect) {
         this.effect = effect;
     }
     public String getEffect() {
         return effect;
     }

    public void setTolerationSeconds(int tolerationSeconds) {
         this.tolerationSeconds = tolerationSeconds;
     }
     public int getTolerationSeconds() {
         return tolerationSeconds;
     }

}