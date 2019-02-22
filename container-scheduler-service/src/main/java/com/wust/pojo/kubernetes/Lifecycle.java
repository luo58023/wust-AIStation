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