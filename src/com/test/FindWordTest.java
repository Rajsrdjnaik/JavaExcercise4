package com.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.main.FindWord;
class FindWordTest {

	@Test
	void test() {
		String str = "This is Harry";
		String find = "Harry";
		FindWord obj = new FindWord();
		boolean exp = obj.findWord(str, find);
		assertEquals(true,exp);
		
	}

}
