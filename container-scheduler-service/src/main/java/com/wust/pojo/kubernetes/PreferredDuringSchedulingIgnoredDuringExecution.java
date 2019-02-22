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