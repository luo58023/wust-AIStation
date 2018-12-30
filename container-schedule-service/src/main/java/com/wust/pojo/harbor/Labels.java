/**
  * Copyright 2018 bejson.com 
  */
package com.wust.pojo.harbor;

import lombok.Data;

/**
 * Auto-generated: 2018-12-19 23:2:0
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Labels {

    private int id;
    private String name;
    private String description;
    private String color;
    private String scope;
    private int project_id;
    private String creation_time;
    private String update_time;
    private boolean deleted;
}