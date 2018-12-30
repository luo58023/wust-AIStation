/**
  * Copyright 2018 bejson.com 
  */
package com.wust.pojo.harbor;

import lombok.Data;

/**
 * Auto-generated: 2018-12-20 21:58:9
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Scan_overview {

    private String digest;
    private String scan_status;
    private int job_id;
    private int severity;
    private String details_key;
    private Components components;
}