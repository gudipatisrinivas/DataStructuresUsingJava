package com.datastructure.string;

public class LongestSubString {
	
	public static int longestSubString(String s) {
		boolean[] bool=new boolean[256];
		int i=0,j=0;
		StringBuffer buffer=new StringBuffer();
		while(i<s.length())
		{
			if(!bool[(int)s.charAt(i)] && j==i) {
				buffer.append(s.charAt(i));
				bool[(int)s.charAt(i)]=true;
				j++;
			}
			i++;
		}
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample="abcabcdd";
		System.out.println(sample.substring(0,longestSubString(sample)));
		sample="bbbbb";
		System.out.println(sample.substring(0,longestSubString(sample)));
	
	}

}
