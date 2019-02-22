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
public class HostAliases {

    private String ip;
    private List<String> hostnames;
    public void setIp(String ip) {
         this.ip = ip;
     }
     public String getIp() {
         return ip;
     }

    public void setHostnames(List<String> hostnames) {
         this.hostnames = hostnames;
     }
     public List<String> getHostnames() {
         return hostnames;
     }

}