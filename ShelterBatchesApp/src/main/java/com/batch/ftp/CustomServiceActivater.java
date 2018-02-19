package com.batch.ftp;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.file.filters.SimplePatternFileListFilter;

public class CustomServiceActivater {
	
	public void callJob() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		System.out.println("CustomServiceActivater called");
		 SimplePatternFileListFilter filter = new SimplePatternFileListFilter("carrier*.csv");
         List<File> matchingFiles = filter.filterFiles(new File("F:/jars").listFiles());
         
         if (CollectionUtils.isNotEmpty(matchingFiles))
	         {
	           
	         
			String[] springConfig  = 
				{	
						"META-INF/spring/batch/jobs/job-config.xml" 
				};
			//JobParameters jobParameters=null;
			JobParameters jobParameters =
		  			  new JobParametersBuilder()
		  			  .addLong("time",System.currentTimeMillis()).toJobParameters();
		  	
			ApplicationContext context = 
					new ClassPathXmlApplicationContext(springConfig);
			
			JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
			
	    	//Job job1 = (Job) context.getBean("helloWorldJob");
	    	//Job job2 = (Job) context.getBean("CustomJob");
	    	Job job = (Job) context.getBean("FTPJOBAdapter");
	
	    	JobExecution jobExecution = jobLauncher.run(job, jobParameters);
	        //JobExecution jobExecution = jobLauncherTestUtils.launchStep("step1");
	        System.out.println("*************************JOB started*****************************************");
		}
	}

}
