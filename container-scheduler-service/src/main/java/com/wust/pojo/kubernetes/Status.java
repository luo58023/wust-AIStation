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
public class Status {

    private int observedGeneration;
    private int replicas;
    private int updatedReplicas;
    private int readyReplicas;
    private int availableReplicas;
    private int unavailableReplicas;
    private List<Conditions> conditions;
    private int collisionCount;
    public void setObservedGeneration(int observedGeneration) {
         this.observedGeneration = observedGeneration;
     }
     public int getObservedGeneration() {
         return observedGeneration;
     }

    public void setReplicas(int replicas) {
         this.replicas = replicas;
     }
     public int getReplicas() {
         return replicas;
     }

    public void setUpdatedReplicas(int updatedReplicas) {
         this.updatedReplicas = updatedReplicas;
     }
     public int getUpdatedReplicas() {
         return updatedReplicas;
     }

    public void setReadyReplicas(int readyReplicas) {
         this.readyReplicas = readyReplicas;
     }
     public int getReadyReplicas() {
         return readyReplicas;
     }

    public void setAvailableReplicas(int availableReplicas) {
         this.availableReplicas = availableReplicas;
     }
     public int getAvailableReplicas() {
         return availableReplicas;
     }

    public void setUnavailableReplicas(int unavailableReplicas) {
         this.unavailableReplicas = unavailableReplicas;
     }
     public int getUnavailableReplicas() {
         return unavailableReplicas;
     }

    public void setConditions(List<Conditions> conditions) {
         this.conditions = conditions;
     }
     public List<Conditions> getConditions() {
         return conditions;
     }

    public void setCollisionCount(int collisionCount) {
         this.collisionCount = collisionCount;
     }
     public int getCollisionCount() {
         return collisionCount;
     }

}