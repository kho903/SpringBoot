package com.jikim.javaoop.logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort <T extends Comparable<T>>{

	public List<T> sort(List<T> list) {
		List<T> answer = new ArrayList<>(list);

		for (int i = answer.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (answer.get(j).compareTo(answer.get(j + 1)) > 0) {
					T temp = answer.get(j);
					answer.set(j, answer.get(j + 1));
					answer.set(j + 1, temp);
				}
			}
		}

		return answer;
	}
}
