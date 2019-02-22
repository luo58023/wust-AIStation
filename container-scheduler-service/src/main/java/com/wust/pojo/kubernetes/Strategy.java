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
public class Strategy {

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