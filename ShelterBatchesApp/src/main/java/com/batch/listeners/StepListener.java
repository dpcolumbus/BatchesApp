package com.batch.listeners;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.integration.file.filters.SimplePatternFileListFilter;

public class StepListener implements StepExecutionListener  {

	@Override
	public void beforeStep(StepExecution stepExecution) {
		// TODO Auto-generated method stub
		//System.out.println("step failed : beforeStep");
		
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		
		return stepExecution.getExitStatus();
		
		
	}

	

	
	
	
}


