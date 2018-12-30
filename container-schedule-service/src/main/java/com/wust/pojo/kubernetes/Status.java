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
public class Status {

    private int currentNumberScheduled;
    private int numberMisscheduled;
    private int desiredNumberScheduled;
    private int numberReady;
    private int observedGeneration;
    private int updatedNumberScheduled;
    private int numberAvailable;
    private int numberUnavailable;
    private int collisionCount;
    private List<Conditions> conditions;
    public void setCurrentNumberScheduled(int currentNumberScheduled) {
         this.currentNumberScheduled = currentNumberScheduled;
     }
     public int getCurrentNumberScheduled() {
         return currentNumberScheduled;
     }

    public void setNumberMisscheduled(int numberMisscheduled) {
         this.numberMisscheduled = numberMisscheduled;
     }
     public int getNumberMisscheduled() {
         return numberMisscheduled;
     }

    public void setDesiredNumberScheduled(int desiredNumberScheduled) {
         this.desiredNumberScheduled = desiredNumberScheduled;
     }
     public int getDesiredNumberScheduled() {
         return desiredNumberScheduled;
     }

    public void setNumberReady(int numberReady) {
         this.numberReady = numberReady;
     }
     public int getNumberReady() {
         return numberReady;
     }

    public void setObservedGeneration(int observedGeneration) {
         this.observedGeneration = observedGeneration;
     }
     public int getObservedGeneration() {
         return observedGeneration;
     }

    public void setUpdatedNumberScheduled(int updatedNumberScheduled) {
         this.updatedNumberScheduled = updatedNumberScheduled;
     }
     public int getUpdatedNumberScheduled() {
         return updatedNumberScheduled;
     }

    public void setNumberAvailable(int numberAvailable) {
         this.numberAvailable = numberAvailable;
     }
     public int getNumberAvailable() {
         return numberAvailable;
     }

    public void setNumberUnavailable(int numberUnavailable) {
         this.numberUnavailable = numberUnavailable;
     }
     public int getNumberUnavailable() {
         return numberUnavailable;
     }

    public void setCollisionCount(int collisionCount) {
         this.collisionCount = collisionCount;
     }
     public int getCollisionCount() {
         return collisionCount;
     }

    public void setConditions(List<Conditions> conditions) {
         this.conditions = conditions;
     }
     public List<Conditions> getConditions() {
         return conditions;
     }

}