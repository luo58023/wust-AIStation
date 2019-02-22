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
public class Capabilities {

    private List<Add> add;
    private List<Drop> drop;
    public void setAdd(List<Add> add) {
         this.add = add;
     }
     public List<Add> getAdd() {
         return add;
     }

    public void setDrop(List<Drop> drop) {
         this.drop = drop;
     }
     public List<Drop> getDrop() {
         return drop;
     }

}