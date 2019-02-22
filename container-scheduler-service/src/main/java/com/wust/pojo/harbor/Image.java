/**
  * Copyright 2018 bejson.com 
  */
package com.wust.pojo.harbor;
import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2018-12-19 23:2:0
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Image {

    private int id;
    private String name;
    private int project_id;
    private String description;
    private int pull_count;
    private int star_count;
    private int tags_count;
    private List<Labels> labels;
    private String creation_time;
    private String update_time;
}