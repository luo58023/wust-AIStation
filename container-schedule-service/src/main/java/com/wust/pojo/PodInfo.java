/**
  * Copyright 2018 bejson.com 
  */
package com.wust.pojo;

import com.wust.pojo.kubernetes.Metadata;
import com.wust.pojo.kubernetes.Spec;
import com.wust.pojo.kubernetes.Status;
import lombok.Data;

/**
 * Auto-generated: 2018-12-28 20:22:43
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class PodInfo {

    private String kind;
    private String apiVersion;
    private Metadata metadata;
    private Spec spec;
    private Status status;
}