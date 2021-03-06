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
public class PodAffinityTerm {

    private LabelSelector labelSelector;
    private List<String> namespaces;
    private String topologyKey;
    public void setLabelSelector(LabelSelector labelSelector) {
         this.labelSelector = labelSelector;
     }
     public LabelSelector getLabelSelector() {
         return labelSelector;
     }

    public void setNamespaces(List<String> namespaces) {
         this.namespaces = namespaces;
     }
     public List<String> getNamespaces() {
         return namespaces;
     }

    public void setTopologyKey(String topologyKey) {
         this.topologyKey = topologyKey;
     }
     public String getTopologyKey() {
         return topologyKey;
     }

}