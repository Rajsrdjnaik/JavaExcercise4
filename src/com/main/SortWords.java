package com.main;

import java.util.Arrays;
public class SortWords {

	public String[] sortWords(String str) {
		String[] array = str.split(" ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        return array;
	}
}
