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
public class PreferredDuringSchedulingIgnoredDuringExecution {

    private int weight;
    private PodAffinityTerm podAffinityTerm;
    public void setWeight(int weight) {
         this.weight = weight;
     }
     public int getWeight() {
         return weight;
     }

    public void setPodAffinityTerm(PodAffinityTerm podAffinityTerm) {
         this.podAffinityTerm = podAffinityTerm;
     }
     public PodAffinityTerm getPodAffinityTerm() {
         return podAffinityTerm;
     }

}