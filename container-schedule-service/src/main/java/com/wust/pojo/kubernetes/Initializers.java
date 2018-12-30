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
public class Initializers {

    private List<Pending> pending;
    private Result result;
    public void setPending(List<Pending> pending) {
         this.pending = pending;
     }
     public List<Pending> getPending() {
         return pending;
     }

    public void setResult(Result result) {
         this.result = result;
     }
     public Result getResult() {
         return result;
     }

}