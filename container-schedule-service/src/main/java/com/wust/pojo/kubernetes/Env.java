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
public class Env {

    private String name;
    private String value;
    private ValueFrom valueFrom;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setValue(String value) {
         this.value = value;
     }
     public String getValue() {
         return value;
     }

    public void setValueFrom(ValueFrom valueFrom) {
         this.valueFrom = valueFrom;
     }
     public ValueFrom getValueFrom() {
         return valueFrom;
     }

}