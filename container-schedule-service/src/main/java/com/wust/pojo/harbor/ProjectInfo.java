/**
  * Copyright 2019 bejson.com 
  */
package com.wust.pojo.harbor;

import lombok.Data;

/**
 * Auto-generated: 2019-02-20 18:45:11
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class ProjectInfo {

    private int project_id;
    private int owner_id;
    private String name;
    private String creation_time;
    private String update_time;
    private boolean deleted;
    private String owner_name;
    private boolean togglable;
    private int current_user_role_id;
    private int repo_count;
    private int chart_count;
    private Metadata metadata;
}