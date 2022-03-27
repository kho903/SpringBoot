package com.jikim.javaoop;

import java.util.Arrays;

import com.jikim.javaoop.logic.BubbleSort;
import com.jikim.javaoop.logic.Sort;

public class Main {
	public static void main(String[] args) {
		Sort<String> sort = new BubbleSort<>();

		System.out.println("[result] " + sort.sort(Arrays.asList(args)));
	}
}
