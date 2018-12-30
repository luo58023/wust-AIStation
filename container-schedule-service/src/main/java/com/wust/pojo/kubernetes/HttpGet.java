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
public class HttpGet {

    private String path;
    private String port;
    private String host;
    private String scheme;
    private List<HttpHeaders> httpHeaders;
    public void setPath(String path) {
         this.path = path;
     }
     public String getPath() {
         return path;
     }

    public void setPort(String port) {
         this.port = port;
     }
     public String getPort() {
         return port;
     }

    public void setHost(String host) {
         this.host = host;
     }
     public String getHost() {
         return host;
     }

    public void setScheme(String scheme) {
         this.scheme = scheme;
     }
     public String getScheme() {
         return scheme;
     }

    public void setHttpHeaders(List<HttpHeaders> httpHeaders) {
         this.httpHeaders = httpHeaders;
     }
     public List<HttpHeaders> getHttpHeaders() {
         return httpHeaders;
     }

}