package com.jikim.javaoop;

import java.util.Arrays;

import com.jikim.javaoop.logic.BubbleSort;

public class Main {
	public static void main(String[] args) {
		BubbleSort<String> sort = new BubbleSort<>();

		System.out.println("[result] " + sort.sort(Arrays.asList(args)));
	}
}
