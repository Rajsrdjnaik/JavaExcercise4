package com.main;

public class CharacterCount {

	public int characterCount(String str, char c) {
	        int count = (int) str.chars().filter(ch->ch==c).count();
	        return count;
	    }
}