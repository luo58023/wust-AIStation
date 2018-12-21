/**
  * Copyright 2018 bejson.com 
  */
package com.wust.pojo.tags;
import com.wust.pojo.image.Labels;

import java.util.List;

/**
 * Auto-generated: 2018-12-20 21:58:8
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Tags {

    private String digest;
    private String name;
    private int size;
    private String architecture;
    private String os;
    private String docker_version;
    private String author;
    private String created;
    private Signature signature;
    private Scan_overview scan_overview;
    private List<Labels> labels;
    public void setDigest(String digest) {
         this.digest = digest;
     }
     public String getDigest() {
         return digest;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setSize(int size) {
         this.size = size;
     }
     public int getSize() {
         return size;
     }

    public void setArchitecture(String architecture) {
         this.architecture = architecture;
     }
     public String getArchitecture() {
         return architecture;
     }

    public void setOs(String os) {
         this.os = os;
     }
     public String getOs() {
         return os;
     }

    public void setDocker_version(String docker_version) {
         this.docker_version = docker_version;
     }
     public String getDocker_version() {
         return docker_version;
     }

    public void setAuthor(String author) {
         this.author = author;
     }
     public String getAuthor() {
         return author;
     }

    public void setCreated(String created) {
         this.created = created;
     }
     public String getCreated() {
         return created;
     }

    public void setSignature(Signature signature) {
         this.signature = signature;
     }
     public Signature getSignature() {
         return signature;
     }

    public void setScan_overview(Scan_overview scan_overview) {
         this.scan_overview = scan_overview;
     }
     public Scan_overview getScan_overview() {
         return scan_overview;
     }

    public void setLabels(List<Labels> labels) {
         this.labels = labels;
     }
     public List<Labels> getLabels() {
         return labels;
     }

}