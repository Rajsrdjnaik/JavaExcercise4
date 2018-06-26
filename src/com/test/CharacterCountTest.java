package com.test;
import com.main.CharacterCount;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CharacterCountTest {

	@Test
	public void test() {
		String str = "abababaaaabababa";
		CharacterCount obj = new CharacterCount();
		char countcharacter = 'b';
		int count = obj.characterCount(str,countcharacter);
		assertEquals(6,count);		
	}

}
