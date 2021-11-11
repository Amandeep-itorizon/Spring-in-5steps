package com.in28minutes.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImp {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("quick")
	SortAlgo quickSortAlgo;
	
	
	
	public int binarySearch(int[] numbers, int searchNum) {
		
		quickSortAlgo.sort(numbers);
		System.out.println(quickSortAlgo);
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("post construct");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("pre Destroy");
	}
}
