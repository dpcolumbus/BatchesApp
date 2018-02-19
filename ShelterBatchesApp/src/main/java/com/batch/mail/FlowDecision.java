package com.batch.mail;


import java.io.File;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;
import org.springframework.integration.file.filters.SimplePatternFileListFilter;

public class FlowDecision implements JobExecutionDecider {
	
	
	
   public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {
   	//System.out.println("entering decieder"+stepExecution.getExitStatus().getExitCode());
   	
	  
	   /*SimplePatternFileListFilter filter = new SimplePatternFileListFilter("carrier_usdot.csv");
       List<File> matchingFiles = filter.filterFiles(new File("F:/jars").listFiles());
       if (CollectionUtils.isEmpty(matchingFiles))
       {
    	   System.out.println("Changing flow execution based on fail step 1 of JOB");
      		
      		return FlowExecutionStatus.FAILED;
       }else {
    	   return FlowExecutionStatus.COMPLETED;
       }*/
	   
   	if(!stepExecution.getExitStatus().getExitCode().equals("FAILED")){
   		System.out.println("Changing flow execution based on fail step 1 of JOB");
   		
   		return FlowExecutionStatus.FAILED;
   	}else {
   		return FlowExecutionStatus.COMPLETED;
   	}
   
   }
}
