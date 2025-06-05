package com.gtel.srpingtutorial.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class ThreadPoolConfig {

    @Bean("fix")
    public ExecutorService fixThreadPool(){
        return  Executors.newFixedThreadPool(100);
    }

    @Bean("threadPoolTaskScheduler")
    public ThreadPoolTaskScheduler threadPoolTaskScheduler(@Value("${fix.task.number:15}") int taskNumber) {
        ThreadPoolTaskScheduler threadPoolTaskScheduler
                = new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(taskNumber);
        threadPoolTaskScheduler.setThreadNamePrefix(
                "ThreadPoolTask");
        return threadPoolTaskScheduler;
    }
}
