package week3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class day3_anagram {
public static void main(String[] args) {
	
	String text1 = "stops";
	String text2 = "potss";
	
	int tex1=text1.length();
	System.out.println(tex1);
	
	int tex2=text2.length();
	System.out.println(text2);
	
	if (tex1==tex2) {
		System.out.println(true);
	}
	String one=text1.toLowerCase();
	String two=text2.toLowerCase();
	System.out.println(one);
	System.out.println(two);
	
	char[] word1 =text1.toCharArray();
	for (int i = 0; i < word1.length; i++) {
		System.out.println(word1[i]);
	}
	char[] word2 =text2.toCharArray();
	for (int i = 0; i < word2.length; i++) {
		System.out.println(word2[i]);
	}
	Arrays.sort(word1);
	for (int i = 0; i < word1.length; i++) {
		System.out.println(word1[i]);
	}
	Arrays.sort(word2);
}
}
