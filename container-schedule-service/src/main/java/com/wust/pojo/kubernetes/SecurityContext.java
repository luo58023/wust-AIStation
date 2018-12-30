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
public class SecurityContext {

    private SeLinuxOptions seLinuxOptions;
    private int runAsUser;
    private int runAsGroup;
    private boolean runAsNonRoot;
    private List<Integer> supplementalGroups;
    private int fsGroup;
    private List<Sysctls> sysctls;
    public void setSeLinuxOptions(SeLinuxOptions seLinuxOptions) {
         this.seLinuxOptions = seLinuxOptions;
     }
     public SeLinuxOptions getSeLinuxOptions() {
         return seLinuxOptions;
     }

    public void setRunAsUser(int runAsUser) {
         this.runAsUser = runAsUser;
     }
     public int getRunAsUser() {
         return runAsUser;
     }

    public void setRunAsGroup(int runAsGroup) {
         this.runAsGroup = runAsGroup;
     }
     public int getRunAsGroup() {
         return runAsGroup;
     }

    public void setRunAsNonRoot(boolean runAsNonRoot) {
         this.runAsNonRoot = runAsNonRoot;
     }
     public boolean getRunAsNonRoot() {
         return runAsNonRoot;
     }

    public void setSupplementalGroups(List<int> supplementalGroups) {
         this.supplementalGroups = supplementalGroups;
     }
     public List<int> getSupplementalGroups() {
         return supplementalGroups;
     }

    public void setFsGroup(int fsGroup) {
         this.fsGroup = fsGroup;
     }
     public int getFsGroup() {
         return fsGroup;
     }

    public void setSysctls(List<Sysctls> sysctls) {
         this.sysctls = sysctls;
     }
     public List<Sysctls> getSysctls() {
         return sysctls;
     }

}