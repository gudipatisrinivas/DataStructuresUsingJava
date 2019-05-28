package com.datastructure.arrays;

public class FrontZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 0, 0, 0 };
		frontZero(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	private static void frontZero(int[] a) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		while(j<a.length-1) {
			if(a[j]!=0) {
				a[i++]=a[j];
				
			}
			j++;
		}
		while(i<a.length) {
			a[i++]=0;
		}
	}

}
