package com.jikim.javaoop.logic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

	@DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
	@Test
	void give_List_WhenExecuting_ThenReturnSortedList() {
		// given
		BubbleSort<Integer> bubbleSort = new BubbleSort<>();

		// when
		List<Integer> actual = bubbleSort.sort(List.of(3, 2, 4, 5, 1));

		// then
		assertEquals(List.of(1, 2, 3, 4, 5), actual);
	}
}