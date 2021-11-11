package com.in28minutes.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgo implements SortAlgo{
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public int[] sort(int [] numbers) {
		return numbers;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("post construct");
	}
}
