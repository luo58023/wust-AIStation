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
public class UpdateStrategy {

    private String type;
    private RollingUpdate rollingUpdate;
    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setRollingUpdate(RollingUpdate rollingUpdate) {
         this.rollingUpdate = rollingUpdate;
     }
     public RollingUpdate getRollingUpdate() {
         return rollingUpdate;
     }

}