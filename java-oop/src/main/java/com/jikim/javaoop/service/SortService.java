package com.jikim.javaoop.service;

import java.util.List;

import com.jikim.javaoop.logic.JavaSort;
import com.jikim.javaoop.logic.Sort;

public class SortService {

	private final Sort<String> sort;

	public SortService(Sort<String> sort) {
		this.sort = sort;
		System.out.println("구현체 : " + sort.getClass().getName());
	}

	public List<String> doSort(List<String> list) {
		return sort.sort(list);
	}
}
