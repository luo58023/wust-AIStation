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
public class AzureDisk {

    private String diskName;
    private String diskURI;
    private CachingMode cachingMode;
    private String fsType;
    private boolean readOnly;
    private Kind kind;
    public void setDiskName(String diskName) {
         this.diskName = diskName;
     }
     public String getDiskName() {
         return diskName;
     }

    public void setDiskURI(String diskURI) {
         this.diskURI = diskURI;
     }
     public String getDiskURI() {
         return diskURI;
     }

    public void setCachingMode(CachingMode cachingMode) {
         this.cachingMode = cachingMode;
     }
     public CachingMode getCachingMode() {
         return cachingMode;
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

    public void setKind(Kind kind) {
         this.kind = kind;
     }
     public Kind getKind() {
         return kind;
     }

}