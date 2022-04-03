package com.jikim.springpractice.logic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JavaSortTest {

	@DisplayName("자바소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
	@Test
	void give_List_WhenExecuting_ThenReturnSortedList() {
		// given
		JavaSort<Integer> javaSort = new JavaSort<>();

		// when
		List<Integer> actual = javaSort.sort(List.of(3, 2, 4, 5, 1));

		// then
		assertEquals(List.of(1, 2, 3, 4, 5), actual);
	}
}