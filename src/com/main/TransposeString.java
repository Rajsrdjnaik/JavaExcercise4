package com.main;

public class TransposeString {

	public String transposeString(String str) {
		StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb = sb.reverse();
        String s[] = sb.toString().split("\\s");
        String s1[] = new String[s.length];
        int j=0;
        for(int i=s.length-1;i>=0;i--) {
            s1[j]=s[i];
            j++;
        }
        StringBuilder sb1 = new StringBuilder();  
        for(String s2:s1){  
           sb1.append(s2);  
           sb1.append(" ");  
        } 
        return sb1.toString().trim();

	}
}
