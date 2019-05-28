package com.datastructure.arrays;

public class ValidPalindrome {
	
	private static boolean validPalidnrome(String s) {
		s = s.toLowerCase();
		if(s==null && s.length()==0) {
			return false;
		}
		else {
			int i=0,j=s.length()-1;
			while(i<j) {
				while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') ||(s.charAt(i)>='0' && s.charAt(i)<='9'))) {
					i++;
				}
				while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z') ||(s.charAt(j)>='0' && s.charAt(j)<='9'))) {
					j--;
				}
				if(s.charAt(i)!=s.charAt(j)) {
					return false;
				}
				i++;
				j--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validPalidnrome("Red rum, sir, is murder"));

	}

}
