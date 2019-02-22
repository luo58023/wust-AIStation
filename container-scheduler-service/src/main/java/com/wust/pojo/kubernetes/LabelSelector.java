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
public class LabelSelector {

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