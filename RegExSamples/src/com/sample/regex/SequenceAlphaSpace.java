package com.sample.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SequenceAlphaSpace {

	public static void main(String[] args) {
		
		// This will match a sequence of 1 or more uppercase and lowercase English letters as well as spaces
		String myRegEx = "[a-zA-Z\\s]+";
		
		// This is the string we will check to see if our regex matches:
		String myString = "The quick brown fox jumped over a lazy dog...";
		
		// Create a Pattern object (compiled RegEx) and save it as 'p'
		Pattern p = Pattern.compile(myRegEx);
		
		// We need a Matcher to match our compiled RegEx to a String
		Matcher m = p.matcher(myString);
		
//		// let's try with while
//		while (m.find()) {
////			 returns false as find() method already found a subsequence matching the pattern
//			System.out.println(m.find());
////			Resets this matcher and then attempts to find the next subsequence of the input sequence that matches the pattern, starting at the specified index.
//			System.out.println(m.find(0));
//		}
		
		// if our Matcher finds a match
		if (m.find()) {
			System.out.println(m.group());
			System.out.println(m.start());
			System.out.println(m.end());
			
//			For a matcher m with input sequence s, the expressions m.group() and s.substring(m.start(), m.end()) are equivalent.
			System.out.println(myString.substring(m.start(), m.end()));
		}
	}

}
