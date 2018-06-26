package com.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.main.MultipleOccurences;

class MultipleOccurencesTest {

	@Test
	void test() {
		String str = "She sells seashells by the seashore";
		String find = "se";
		MultipleOccurences obj = new MultipleOccurences();
		String exp = obj.findIndexes(str, find);
		assertEquals("4-6 10-12 27-29",exp);	}

}
