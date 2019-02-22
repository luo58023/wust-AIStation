/**
  * Copyright 2019 bejson.com 
  */
package com.wust.pojo.kubernetes;
import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2019-02-20 21:8:53
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class SecurityContext {

    private SeLinuxOptions seLinuxOptions;
    private int runAsUser;
    private int runAsGroup;
    private boolean runAsNonRoot;
    private List<Integer> supplementalGroups;
    private int fsGroup;
    private List<Sysctls> sysctls;
}