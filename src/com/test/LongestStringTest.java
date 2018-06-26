package com.test;

import static org.junit.jupiter.api.Assertions.*;
import com.main.LongestString;
import org.junit.jupiter.api.Test;

class LongestStringTest {

	@Test
	void test() {

		LongestString obj = new LongestString();
		String str = obj.longestSubstring("aabbccabababaaaabababacbabccbcbcb");
		assertEquals("abababaaaabababa",str);
		
	}

}
