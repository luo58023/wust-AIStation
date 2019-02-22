package com.wust.vo;

import lombok.Data;
import java.util.Date;

@Data
public class TicketInfo {
    private String ticketId;
    private String userId;
    private String podName;
    private String namespace;
    private String mode;
    private Integer cpuCount;
    private String mountName;
    private String mountPath;
    private String pvcName;
    private String storage;
    private String image;
    private Integer flow;
    private String podStatus;
    private Date createTime;
}
