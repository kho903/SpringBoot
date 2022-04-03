package com.jikim.springpractice.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class JavaSort <T extends Comparable<T>> implements Sort<T> {

	public List<T> sort(List<T> list) {
		List<T> answer = new ArrayList<>(list);
		Collections.sort(answer);

		return answer;
	}
}
