/**
  * Copyright 2018 bejson.com 
  */
package com.wust.pojo.harbor;
import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2018-12-20 21:58:8
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Tag {

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
}