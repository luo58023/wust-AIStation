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