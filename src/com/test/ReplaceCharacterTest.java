package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.ReplaceCharacter;

class ReplaceCharacterTest {

	@Test
	public void test() {
	String stringInput = "daily dry";
	String characterToBeReplaced = "f";
	ReplaceCharacter obj = new ReplaceCharacter();
	String newString = obj.replaceCharacter(stringInput,characterToBeReplaced);
	assertEquals("faily fry",newString);
	}

}
