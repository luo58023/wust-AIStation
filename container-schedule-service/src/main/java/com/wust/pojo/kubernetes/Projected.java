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
public class Projected {

    private List<Sources> sources;
    private int defaultMode;
    public void setSources(List<Sources> sources) {
         this.sources = sources;
     }
     public List<Sources> getSources() {
         return sources;
     }

    public void setDefaultMode(int defaultMode) {
         this.defaultMode = defaultMode;
     }
     public int getDefaultMode() {
         return defaultMode;
     }

}