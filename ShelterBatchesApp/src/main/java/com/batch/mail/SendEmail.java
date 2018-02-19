package com.batch.mail;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

class SendEmail implements Tasklet {
	  @Override
	  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		 
		  	 
		  System.out.println("SendEmail: Email sent for failure");
		
		
		  return RepeatStatus.FINISHED; 
		//  return repeatStatus;
	  }
	}