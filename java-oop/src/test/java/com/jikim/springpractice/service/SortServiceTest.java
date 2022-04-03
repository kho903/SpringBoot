package com.jikim.springpractice.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.jikim.springpractice.logic.JavaSort;

class SortServiceTest {

	private SortService sortService = new SortService(new JavaSort<String>());

	@Test
	void test() {
	    // given

	    // when
		List<String> answer = sortService.doSort(List.of("3", "2", "1"));

		// then
		assertEquals(List.of("1", "2", "3"), answer);
	}
}