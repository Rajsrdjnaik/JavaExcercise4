package com.test;

import static org.junit.jupiter.api.Assertions.*;
import com.main.SortWords;

import org.junit.jupiter.api.Test;

class SortWordsTest {

	@Test
	public void test() {
		String str = "rajat is a good boy";
		SortWords obj = new SortWords();
		String[] string = obj.sortWords(str);
		assertEquals("a", string[0]);
		assertEquals("boy", string[1]);
		assertEquals("good", string[2]);
		assertEquals("is", string[3]);
		assertEquals("rajat", string[4]);
		
	}

}
