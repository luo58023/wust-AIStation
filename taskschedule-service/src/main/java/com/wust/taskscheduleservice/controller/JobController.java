package com.wust.taskscheduleservice.controller;


import com.wust.taskscheduleservice.pojo.response.ResponseBuilder;
import com.wust.taskscheduleservice.service.JobService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Api(description = "wustAI taskSchedule api", tags = "taskSchedule api")
@RestController
@RequestMapping("/job")
public class JobController {

    private static final Logger logger = LoggerFactory.getLogger(JobController.class);

   JobService jobService;

    @Autowired
    public void setJobService(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping(value = "/hello")
    public void hello(@RequestParam String hello) {
        System.out.println("hello world");
    }
    /**
     * 添加定时任务
     */
    @ApiOperation(value = "添加定时任务")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "jobClassName", value = "定时任务类的全限定类名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "jobGroupName", value = "定时任务所属组名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "cronExpression", value = "定时时间cron表达式", required = true, dataType = "String")
    })
    @PostMapping(value = "/addJob")
    public ResponseEntity addJob(@RequestParam String jobClassName,
                                 @RequestParam String jobGroupName,
                                 @RequestParam String cronExpression) {
        boolean result = jobService.addJob(jobClassName, jobGroupName, cronExpression);
        if (result) {
            return ResponseBuilder.ok("定时任务添加成功");
        } else {
            return ResponseBuilder.newBuilder(HttpStatus.BAD_REQUEST).body("定时任务添加失败").build();
        }
    }

    /**
     *暂停定时任务
     */
    @ApiOperation(value = "暂停定时任务")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "jobClassName", value = "定时任务全限定类名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "jobGroupName", value = "定时任务所属组名", required = true, dataType = "String")
    })
    @PostMapping("/pauseJob")
    public ResponseEntity pauseJob(@RequestParam String jobClassName,
                                   @RequestParam String jobGroupName) {
        boolean result = jobService.pauseJob(jobClassName, jobGroupName);
        if (result) {
            return ResponseBuilder.ok("暂停任务成功");
        } else {
            return ResponseBuilder.newBuilder(HttpStatus.BAD_REQUEST).body("暂停任务失败").build();
        }
    }

    /**
     * 恢复定时任务
     */
    @ApiOperation(value = "恢复定时任务")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "jobClassName", value = "定时任务全限定类名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "jobGroupName", value = "定时任务所属组名", required = true, dataType = "String")
    })
    @PostMapping("/resumeJob")
    public ResponseEntity resumeJob(@RequestParam String jobClassName,
                                    @RequestParam String jobGroupName) {
        boolean result = jobService.resumeJob(jobClassName, jobGroupName);
        if (result) {
            return ResponseBuilder.ok("恢复定时任务成功");
        } else {
            return ResponseBuilder.newBuilder(HttpStatus.BAD_REQUEST).body("恢复定时任务失败").build();
        }
    }

    /**
     * 定时任务重调度
     */
    @ApiOperation(value = "重调度定时任务")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "jobClassName", value = "定时任务类的全限定类名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "jobGroupName", value = "定时任务所属组名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "cronExpression", value = "定时时间cron表达式", required = true, dataType = "String")
    })
    @PostMapping("/rescheduleJob")
    public ResponseEntity rescheduleJob(@RequestParam String jobClassName,
                                        @RequestParam String jobGroupName,
                                        @RequestParam String cronExpression) {
        boolean result = jobService.rescheduleJob(jobClassName, jobGroupName, cronExpression);
        if (result) {
            return ResponseBuilder.ok("重置定时任务成功");
        } else {
            return ResponseBuilder.newBuilder(HttpStatus.BAD_REQUEST).body("重置定时任务失败").build();
        }
    }

    /**
     * 删除定时任务
     */
    @ApiOperation(value = "删除定时任务")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "jobClassName", value = "定时任务全限定类名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "jobGroupName", value = "定时任务所属组名", required = true, dataType = "String")
    })
    @PostMapping("/deleteJob")
    public ResponseEntity deleteJob(@RequestParam String jobClassName,
                                    @RequestParam String jobGroupName) {
        boolean result = jobService.deleteJob(jobClassName, jobGroupName);
        if (result) {
            return ResponseBuilder.ok("删除定时任务成功");
        } else {
            return ResponseBuilder.newBuilder(HttpStatus.BAD_REQUEST).body("删除定时任务失败").build();
        }
    }
}
