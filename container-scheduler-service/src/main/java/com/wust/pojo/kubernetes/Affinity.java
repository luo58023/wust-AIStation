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
public class Affinity {

    private NodeAffinity nodeAffinity;
    private PodAffinity podAffinity;
    private PodAntiAffinity podAntiAffinity;
    public void setNodeAffinity(NodeAffinity nodeAffinity) {
         this.nodeAffinity = nodeAffinity;
     }
     public NodeAffinity getNodeAffinity() {
         return nodeAffinity;
     }

    public void setPodAffinity(PodAffinity podAffinity) {
         this.podAffinity = podAffinity;
     }
     public PodAffinity getPodAffinity() {
         return podAffinity;
     }

    public void setPodAntiAffinity(PodAntiAffinity podAntiAffinity) {
         this.podAntiAffinity = podAntiAffinity;
     }
     public PodAntiAffinity getPodAntiAffinity() {
         return podAntiAffinity;
     }

}