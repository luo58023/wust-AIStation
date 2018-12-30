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
public class Selector {

    private String matchLabels;
    private List<MatchExpressions> matchExpressions;
    public void setMatchLabels(String matchLabels) {
         this.matchLabels = matchLabels;
     }
     public String getMatchLabels() {
         return matchLabels;
     }

    public void setMatchExpressions(List<MatchExpressions> matchExpressions) {
         this.matchExpressions = matchExpressions;
     }
     public List<MatchExpressions> getMatchExpressions() {
         return matchExpressions;
     }

}