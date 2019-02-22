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
public class ReadinessProbe {

    private Exec exec;
    private HttpGet httpGet;
    private TcpSocket tcpSocket;
    private int initialDelaySeconds;
    private int timeoutSeconds;
    private int periodSeconds;
    private int successThreshold;
    private int failureThreshold;
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

    public void setInitialDelaySeconds(int initialDelaySeconds) {
         this.initialDelaySeconds = initialDelaySeconds;
     }
     public int getInitialDelaySeconds() {
         return initialDelaySeconds;
     }

    public void setTimeoutSeconds(int timeoutSeconds) {
         this.timeoutSeconds = timeoutSeconds;
     }
     public int getTimeoutSeconds() {
         return timeoutSeconds;
     }

    public void setPeriodSeconds(int periodSeconds) {
         this.periodSeconds = periodSeconds;
     }
     public int getPeriodSeconds() {
         return periodSeconds;
     }

    public void setSuccessThreshold(int successThreshold) {
         this.successThreshold = successThreshold;
     }
     public int getSuccessThreshold() {
         return successThreshold;
     }

    public void setFailureThreshold(int failureThreshold) {
         this.failureThreshold = failureThreshold;
     }
     public int getFailureThreshold() {
         return failureThreshold;
     }

}