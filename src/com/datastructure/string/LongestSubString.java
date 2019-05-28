package com.datastructure.string;

import java.util.HashSet;

public class LongestSubString {
	
	public static int longestSubString(String s) {
		if(s==null||s.length()==0){
	        return 0;
	    }
	 
	    HashSet<Character> set = new HashSet<>();
	    int result = 1;
	    int i=0; 
	    for(int j=0; j<s.length(); j++){
	        char c = s.charAt(j);
	        if(!set.contains(c)){
	            set.add(c);
	            result = Math.max(result, set.size());
	        }else{
	            while(i<j){
	                if(s.charAt(i)==c){
	                    i++;
	                    break;
	                }
	 
	                set.remove(s.charAt(i));
	                i++;
	            }
	        }    
	    }
	 
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample="abcabcdd";
		System.out.println(sample.substring(0,longestSubString(sample)));
		sample="bbbbb";
		System.out.println(sample.substring(0,longestSubString(sample)));
		sample="pwwkew";
	}

}
