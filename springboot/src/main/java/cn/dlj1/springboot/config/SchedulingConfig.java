package cn.dlj1.springboot.config;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

//@Configuration
@EnableScheduling
public class SchedulingConfig  implements SchedulingConfigurer {

	@Scheduled(cron="0/10 * * * * ?")
    public void executeFileDownLoadTask() {
        Thread current = Thread.currentThread(); 
        System.out.println("定时任务1:"+current.getId());
    }

	@Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(taskExecutor());
    }
 
    @Bean(destroyMethod="shutdown")
    public Executor taskExecutor() {
        return Executors.newScheduledThreadPool(1);
    }

}