package cn.dlj1.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
public class AsyncConfig {

	@Async
    public void task() throws InterruptedException{  
        long currentTimeMillis = System.currentTimeMillis();  
        Thread.sleep(1000);  
        long currentTimeMillis1 = System.currentTimeMillis();  
        System.out.println("task任务耗时:"+(currentTimeMillis1-currentTimeMillis)+"ms");  
    }  

}