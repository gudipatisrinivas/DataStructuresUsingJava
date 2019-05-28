package com.datastructure.arrays;

public class ValidPalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(validPalidnrome("Red rum, sir, is murder"));


	}

	private static boolean validPalidnrome(String s) {
		// TODO Auto-generated method stub
		
		int i=0,j=s.length()-1;
		s=s.toLowerCase();
		while(i<j) {
			while(i<j && !(s.charAt(i)>='a' && s.charAt(i)<='z')) {
				i++;
			}
			while(i<j && !(s.charAt(j)>='a' && s.charAt(j)<='z')) {
				j--;
			}
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
