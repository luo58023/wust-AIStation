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
public class Fc {

    private List<String> targetWWNs;
    private int lun;
    private String fsType;
    private boolean readOnly;
    private List<String> wwids;
    public void setTargetWWNs(List<String> targetWWNs) {
         this.targetWWNs = targetWWNs;
     }
     public List<String> getTargetWWNs() {
         return targetWWNs;
     }

    public void setLun(int lun) {
         this.lun = lun;
     }
     public int getLun() {
         return lun;
     }

    public void setFsType(String fsType) {
         this.fsType = fsType;
     }
     public String getFsType() {
         return fsType;
     }

    public void setReadOnly(boolean readOnly) {
         this.readOnly = readOnly;
     }
     public boolean getReadOnly() {
         return readOnly;
     }

    public void setWwids(List<String> wwids) {
         this.wwids = wwids;
     }
     public List<String> getWwids() {
         return wwids;
     }

}