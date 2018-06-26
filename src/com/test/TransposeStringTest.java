package com.test;

import static org.junit.jupiter.api.Assertions.*;
import com.main.TransposeString;

import org.junit.jupiter.api.Test;

class TransposeStringTest {

	@Test
	void test() {
		String str = "a quick brown fox jumps over the lazy dog";
		TransposeString obj = new TransposeString();
		String transpose = obj.transposeString(str);
		assertEquals("a kciuq nworb xof spmuj revo eht yzal god",transpose);
	}

}
