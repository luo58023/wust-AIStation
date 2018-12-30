package com.wust.taskscheduleservice.service;

import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ygtao
 */
@Service
public class JobService {

    private static final Logger logger = LoggerFactory.getLogger(JobService.class);

    Scheduler scheduler;

    @Autowired
    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    /**
     * 添加任务job
     * @param jobClassName job所属类的全限定类名
     * @param jobGroupName job所属组
     * @param cronExpression cron表达式
     */
    public boolean addJob(String jobClassName, String jobGroupName, String cronExpression)  {
        try {
            //启动调度器
            scheduler.start();
            //构建job信息
            JobDetail jobDetail = JobBuilder.newJob(getClass(jobClassName).getClass())
                    .withIdentity(jobClassName, jobGroupName)
                    .build();
            //任务执行时间
            CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(cronExpression);
            //构建trigger
            CronTrigger cronTrigger = TriggerBuilder.newTrigger()
                    .withIdentity(jobClassName, jobGroupName)
                    .withSchedule(cronScheduleBuilder)
                    .build();
            //开始调度
            scheduler.scheduleJob(jobDetail, cronTrigger);
            return true;
        } catch (SchedulerException e) {
            logger.error("创建定时任务失败");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 暂停任务
     * @param jobClassName
     * @param jobGroupName
     * @return
     */
    public boolean pauseJob(String jobClassName, String jobGroupName) {
        try {
            scheduler.pauseJob(JobKey.jobKey(jobClassName, jobGroupName));
            return true;
        } catch (SchedulerException e) {
            logger.error("暂停任务：" + jobClassName + "失败");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 恢复任务
     * @param jobClassName
     * @param jobGroupName
     * @return
     */
    public boolean resumeJob(String jobClassName, String jobGroupName) {
        try {
            scheduler.resumeJob(JobKey.jobKey(jobClassName, jobGroupName));
            return true;
        } catch (SchedulerException e) {
            logger.error("恢复任务：" + jobClassName + "失败");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 定时任务重新调度
     * @param jobClassName
     * @param jobGroupName
     * @param cronExpression
     * @return
     */
    public boolean rescheduleJob(String jobClassName, String jobGroupName, String cronExpression) {
        try {
            CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(cronExpression);
            //根据job名和group名唯一确定一个旧的触发器
            TriggerKey triggerKey = TriggerKey.triggerKey(jobClassName, jobGroupName);
            CronTrigger cronTrigger =(CronTrigger)scheduler.getTrigger(triggerKey);
            //构建新的trigger
            cronTrigger = cronTrigger.getTriggerBuilder()
                    .withIdentity(triggerKey)
                    .withSchedule(cronScheduleBuilder)
                    .build();
            scheduler.rescheduleJob(triggerKey, cronTrigger);
            return true;
        } catch (SchedulerException e) {
            logger.error("更新定时任务" + jobClassName + "失败");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 删除定时任务
     * @param jobClassName
     * @param jobGroupName
     * @return
     */
    public boolean deleteJob(String jobClassName, String jobGroupName) {
        try {
            //停止任务trigger
            scheduler.pauseTrigger(TriggerKey.triggerKey(jobClassName, jobGroupName));
            //停止任务调度
            scheduler.unscheduleJob(TriggerKey.triggerKey(jobClassName, jobGroupName));
            //删除job
            scheduler.deleteJob(JobKey.jobKey(jobClassName, jobGroupName));
            return true;
        } catch (SchedulerException e) {
            logger.error("删除定时任务:" + jobClassName + "失败");
            e.printStackTrace();
            return false;
        }
    }


    /**
     * 根据job名，通过反射机制，返回job对应的实现类的一个实例
     * @param jobClassName
     * @return
     */
    private static Job getClass(String jobClassName)  {
        try {
            Class clazz = Class.forName(jobClassName);
            return (Job)clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
