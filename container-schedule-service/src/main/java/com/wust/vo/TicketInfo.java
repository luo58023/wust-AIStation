package com.wust.vo;

import lombok.Data;
import java.util.Date;

@Data
public class TicketInfo {
    private String userId;
    private String mode;
    private Integer cpuCount;
    private String storage;
    private String image;
    private Integer flow;
    private Date createTime;
}
