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
public class Lifecycle {

    private PostStart postStart;
    private PreStop preStop;
    public void setPostStart(PostStart postStart) {
         this.postStart = postStart;
     }
     public PostStart getPostStart() {
         return postStart;
     }

    public void setPreStop(PreStop preStop) {
         this.preStop = preStop;
     }
     public PreStop getPreStop() {
         return preStop;
     }

}