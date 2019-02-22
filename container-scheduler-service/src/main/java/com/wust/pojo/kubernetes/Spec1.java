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
public class Spec1 {

    private List<Volumes> volumes;
    private List<InitContainers> initContainers;
    private List<Containers> containers;
    private String restartPolicy;
    private int terminationGracePeriodSeconds;
    private int activeDeadlineSeconds;
    private String dnsPolicy;
    private String nodeSelector;
    private String serviceAccountName;
    private String serviceAccount;
    private boolean automountServiceAccountToken;
    private String nodeName;
    private boolean hostNetwork;
    private boolean hostPID;
    private boolean hostIPC;
    private boolean shareProcessNamespace;
    private SecurityContext securityContext;
    private List<ImagePullSecrets> imagePullSecrets;
    private String hostname;
    private String subdomain;
    private Affinity affinity;
    private String schedulerName;
    private List<Tolerations> tolerations;
    private List<HostAliases> hostAliases;
    private String priorityClassName;
    private int priority;
    private DnsConfig dnsConfig;
    private List<ReadinessGates> readinessGates;
    private String runtimeClassName;
    private boolean enableServiceLinks;
}