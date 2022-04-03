package com.jikim.springpractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jikim.springpractice.logic.Sort;

@Service
public class SortService {

	private final Sort<String> sort;

	public SortService(@Qualifier("bubbleSort") Sort<String> sort) {
		this.sort = sort;
		System.out.println("구현체 : " + sort.getClass().getName());
	}

	public List<String> doSort(List<String> list) {
		return sort.sort(list);
	}
}
