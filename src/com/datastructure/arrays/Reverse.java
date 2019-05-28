package com.datastructure.arrays;

public class Reverse {
	
	public static void reverseWords(char[] s) {
		int temp=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]==' ') {
				reverse(s,temp,i-1);
				temp=i+1;
			}
		}
		System.out.println(new String(s));
		reverse(s,temp,s.length-1);
		System.out.println(new String(s));
		reverse(s,0,s.length-1);
		System.out.println(new String(s));
	    
	}
	 
	public static void reverse(char[] s, int i, int j){
		while(i<j) {
			char c=s[i];
			s[i]=s[j];
			s[j]=c;
			i++;
			j--;
		}
	  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseWords("srinivas how are you".toCharArray());

	}

}
