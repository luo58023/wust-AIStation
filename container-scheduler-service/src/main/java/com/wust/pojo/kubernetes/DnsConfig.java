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
public class DnsConfig {

    private List<String> nameservers;
    private List<String> searches;
    private List<Options> options;
    public void setNameservers(List<String> nameservers) {
         this.nameservers = nameservers;
     }
     public List<String> getNameservers() {
         return nameservers;
     }

    public void setSearches(List<String> searches) {
         this.searches = searches;
     }
     public List<String> getSearches() {
         return searches;
     }

    public void setOptions(List<Options> options) {
         this.options = options;
     }
     public List<Options> getOptions() {
         return options;
     }

}