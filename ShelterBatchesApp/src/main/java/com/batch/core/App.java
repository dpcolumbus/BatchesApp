package com.batch.core;

import java.util.Random;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ImportResource("classpath:META-INF/spring/batch/jobs/job-config.xml")
public class App {
	
	
	
	public static void main(String[] args) {
		
		String[] springConfig  = 
			{	
					"META-INF/spring/batch/jobs/job-config.xml" 
			};
	        
	  	
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(springConfig);
	/*	
		App a =new App();
		try {
			a.testJOb();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	 SpringApplication.run(App.class, args);
}
	
	//@RequestMapping("/ShelterJOB")
	//public String handle() throws Exception {/*
 
		
		//try {
			/*String[] springConfig  = 
				{	
						"spring/batch/jobs/job-config.xml" 
				};
		         JobParameters jobParameters=null;
		        
		        
		             // get next long value 
		             long value = (long)(Math.random() * 1000000);
		         JobParametersBuilder jobBuilder= new JobParametersBuilder();
		          jobBuilder.addString("status", "1");
		          jobBuilder.addLong("run.id", value).toJobParameters();
		          jobParameters =jobBuilder.toJobParameters();

		        System.out.println("jobParameters:::"+jobParameters);*/
		  	
			//ApplicationContext context = 
					//new ClassPathXmlApplicationContext(springConfig);
			
			//JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
			
	    	
	    	//Job job = (Job) context.getBean("ShelterJOB");

	    //	JobExecution jobExecution = jobLauncher.run(job, jobParameters);
	    //  System.out.println("result::"+jobExecution.getExitStatus());
		//} catch (Exception e) {
		//	e.printStackTrace();
	//	}
 
	//	return "Done";
	
	
//*/
		      //  }
	

	
	
	
}
