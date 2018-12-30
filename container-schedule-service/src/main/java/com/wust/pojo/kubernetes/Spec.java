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
public class Spec {

    private Selector selector;
    private Template template;
    private UpdateStrategy updateStrategy;
    private int minReadySeconds;
    private int revisionHistoryLimit;
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

    public void setUpdateStrategy(UpdateStrategy updateStrategy) {
         this.updateStrategy = updateStrategy;
     }
     public UpdateStrategy getUpdateStrategy() {
         return updateStrategy;
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

}