package com.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWord {

		public boolean findWord(String str, String find) {
			
			Pattern pattern = Pattern.compile(find);
	        Matcher  matcher = pattern.matcher(str);
	        boolean actual = false;
	        while (matcher.find()) {
	            actual = true;}
	        return actual;
		}
}
