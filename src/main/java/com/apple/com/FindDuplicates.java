package com.apple.com;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
	public static void main(String[] args) 
	{
		String str = "findingduplicates";
		char[] chars = str.toCharArray();
		
		//Find Duplicate characters
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c : chars) 
		{
			if(map.containsKey(c)) {
				int counter = map.get(c);
				map.put(c, ++counter);
			} else {
				map.put(c, 1);
			}
		}
		
		System.out.println("Duplicate characters in given string:");
		
		//Print duplicates in String
		for(char c : map.keySet()) {
			if(map.get(c) > 1) {
				System.out.println(c);
			}
		}
	}
}
