/**
  * Copyright 2019 bejson.com 
  */
package com.wust.pojo.kubernetes;

/**
 * Auto-generated: 2019-02-20 21:8:53
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class PreStop {

    private Exec exec;
    private HttpGet httpGet;
    private TcpSocket tcpSocket;
    public void setExec(Exec exec) {
         this.exec = exec;
     }
     public Exec getExec() {
         return exec;
     }

    public void setHttpGet(HttpGet httpGet) {
         this.httpGet = httpGet;
     }
     public HttpGet getHttpGet() {
         return httpGet;
     }

    public void setTcpSocket(TcpSocket tcpSocket) {
         this.tcpSocket = tcpSocket;
     }
     public TcpSocket getTcpSocket() {
         return tcpSocket;
     }

}