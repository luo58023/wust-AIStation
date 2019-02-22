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
public class Spec {

    private int replicas;
    private Selector selector;
    private Template template;
    private Strategy strategy;
    private int minReadySeconds;
    private int revisionHistoryLimit;
    private boolean paused;
    private int progressDeadlineSeconds;
    public void setReplicas(int replicas) {
         this.replicas = replicas;
     }
     public int getReplicas() {
         return replicas;
     }

    public void setSelector(Selector selector) {
         this.selector = selector;
     }
     public Selector getSelector() {
         return selector;
     }

    public void setTemplate(Template template) {
         this.template = template;
     }
     public Template getTemplate() {
         return template;
     }

    public void setStrategy(Strategy strategy) {
         this.strategy = strategy;
     }
     public Strategy getStrategy() {
         return strategy;
     }

    public void setMinReadySeconds(int minReadySeconds) {
         this.minReadySeconds = minReadySeconds;
     }
     public int getMinReadySeconds() {
         return minReadySeconds;
     }

    public void setRevisionHistoryLimit(int revisionHistoryLimit) {
         this.revisionHistoryLimit = revisionHistoryLimit;
     }
     public int getRevisionHistoryLimit() {
         return revisionHistoryLimit;
     }

    public void setPaused(boolean paused) {
         this.paused = paused;
     }
     public boolean getPaused() {
         return paused;
     }

    public void setProgressDeadlineSeconds(int progressDeadlineSeconds) {
         this.progressDeadlineSeconds = progressDeadlineSeconds;
     }
     public int getProgressDeadlineSeconds() {
         return progressDeadlineSeconds;
     }

}