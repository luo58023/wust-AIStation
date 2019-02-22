/**
  * Copyright 2019 bejson.com 
  */
package com.wust.pojo.kubernetes;
import java.util.List;

/**
 * Auto-generated: 2019-02-20 21:8:53
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Iscsi {

    private String targetPortal;
    private String iqn;
    private int lun;
    private String iscsiInterface;
    private String fsType;
    private boolean readOnly;
    private List<String> portals;
    private boolean chapAuthDiscovery;
    private boolean chapAuthSession;
    private SecretRef secretRef;
    private String initiatorName;
    public void setTargetPortal(String targetPortal) {
         this.targetPortal = targetPortal;
     }
     public String getTargetPortal() {
         return targetPortal;
     }

    public void setIqn(String iqn) {
         this.iqn = iqn;
     }
     public String getIqn() {
         return iqn;
     }

    public void setLun(int lun) {
         this.lun = lun;
     }
     public int getLun() {
         return lun;
     }

    public void setIscsiInterface(String iscsiInterface) {
         this.iscsiInterface = iscsiInterface;
     }
     public String getIscsiInterface() {
         return iscsiInterface;
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

    public void setPortals(List<String> portals) {
         this.portals = portals;
     }
     public List<String> getPortals() {
         return portals;
     }

    public void setChapAuthDiscovery(boolean chapAuthDiscovery) {
         this.chapAuthDiscovery = chapAuthDiscovery;
     }
     public boolean getChapAuthDiscovery() {
         return chapAuthDiscovery;
     }

    public void setChapAuthSession(boolean chapAuthSession) {
         this.chapAuthSession = chapAuthSession;
     }
     public boolean getChapAuthSession() {
         return chapAuthSession;
     }

    public void setSecretRef(SecretRef secretRef) {
         this.secretRef = secretRef;
     }
     public SecretRef getSecretRef() {
         return secretRef;
     }

    public void setInitiatorName(String initiatorName) {
         this.initiatorName = initiatorName;
     }
     public String getInitiatorName() {
         return initiatorName;
     }

}