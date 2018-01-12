package com.smart.ssp.lite;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@SpringBootApplication
@EnableScheduling
public class SmartApplication {

	private static final Logger logger = LoggerFactory.getLogger(SmartApplication.class);

	@Autowired
//	private KafkaSender kafkaSender;

	public static void main(String[] args) {
		SpringApplication.run(SmartApplication.class, args);
	}

//	//然后每隔1分钟执行一次
//	@Scheduled(fixedRate = 1000 * 10)
//	public void testKafka() throws Exception {
//		kafkaSender.sendTest();
//	}
//	@Bean
//	public TaskScheduler taskScheduler(){
//		ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
//		taskScheduler.setPoolSize(10);
//		taskScheduler.setThreadNamePrefix("springBoot-task");
//		return taskScheduler;
//	}

}
