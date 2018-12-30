/**
  * Copyright 2018 bejson.com 
  */
package com.wust.pojo.kubernetes;

/**
 * Auto-generated: 2018-12-28 20:22:43
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Ports {

    private String name;
    private int hostPort;
    private int containerPort;
    private String protocol;
    private String hostIP;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setHostPort(int hostPort) {
         this.hostPort = hostPort;
     }
     public int getHostPort() {
         return hostPort;
     }

    public void setContainerPort(int containerPort) {
         this.containerPort = containerPort;
     }
     public int getContainerPort() {
         return containerPort;
     }

    public void setProtocol(String protocol) {
         this.protocol = protocol;
     }
     public String getProtocol() {
         return protocol;
     }

    public void setHostIP(String hostIP) {
         this.hostIP = hostIP;
     }
     public String getHostIP() {
         return hostIP;
     }

}