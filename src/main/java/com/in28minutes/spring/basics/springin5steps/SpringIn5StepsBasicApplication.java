package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImp;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
//		BinarySearchImp binarySearchImp = new BinarySearchImp(new QuickSortAlgo());
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		BinarySearchImp binarySearchImp = applicationContext.getBean(BinarySearchImp.class);
		BinarySearchImp binarySearchImp1 = applicationContext.getBean(BinarySearchImp.class);
		System.out.println(binarySearchImp);
		System.out.println(binarySearchImp1);

		int res = binarySearchImp.binarySearch(new int[] {12, 4, 3}, 3);
		System.out.println(res);
		
		
	}

}
