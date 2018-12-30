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
public class PodAffinity {

    private List<RequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution;
    private List<PreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution;
    public void setRequiredDuringSchedulingIgnoredDuringExecution(List<RequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
         this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
     }
     public List<RequiredDuringSchedulingIgnoredDuringExecution> getRequiredDuringSchedulingIgnoredDuringExecution() {
         return requiredDuringSchedulingIgnoredDuringExecution;
     }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(List<PreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
         this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
     }
     public List<PreferredDuringSchedulingIgnoredDuringExecution> getPreferredDuringSchedulingIgnoredDuringExecution() {
         return preferredDuringSchedulingIgnoredDuringExecution;
     }

}