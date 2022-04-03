package com.jikim.springpractice;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jikim.springpractice.config.Config;
import com.jikim.springpractice.service.SortService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		SortService sortService = context.getBean(SortService.class);

		System.out.println("[result] " + sortService.doSort(Arrays.asList(args)));
	}
}
