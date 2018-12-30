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
public class Preference {

    private List<MatchExpressions> matchExpressions;
    private List<MatchFields> matchFields;
    public void setMatchExpressions(List<MatchExpressions> matchExpressions) {
         this.matchExpressions = matchExpressions;
     }
     public List<MatchExpressions> getMatchExpressions() {
         return matchExpressions;
     }

    public void setMatchFields(List<MatchFields> matchFields) {
         this.matchFields = matchFields;
     }
     public List<MatchFields> getMatchFields() {
         return matchFields;
     }

}