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
public class VolumeMounts {

    private String name;
    private boolean readOnly;
    private String mountPath;
    private String subPath;
    private MountPropagation mountPropagation;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setReadOnly(boolean readOnly) {
         this.readOnly = readOnly;
     }
     public boolean getReadOnly() {
         return readOnly;
     }

    public void setMountPath(String mountPath) {
         this.mountPath = mountPath;
     }
     public String getMountPath() {
         return mountPath;
     }

    public void setSubPath(String subPath) {
         this.subPath = subPath;
     }
     public String getSubPath() {
         return subPath;
     }

    public void setMountPropagation(MountPropagation mountPropagation) {
         this.mountPropagation = mountPropagation;
     }
     public MountPropagation getMountPropagation() {
         return mountPropagation;
     }

}