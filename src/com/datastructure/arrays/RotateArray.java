package com.datastructure.arrays;

import java.util.stream.IntStream;

public class RotateArray {
	
	private static int[] rotateArray(int[] a,int times) {
		if(a == null || a.length == 1) 
			return a;
		int mid=a.length-1-times;
		if(a.length>2) {
			rotate(a,0,mid-1);
			rotate(a,mid,a.length-1);
			rotate(a,0,a.length-1);
		}
		
		return a;
		
	}

	private static void rotate(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		int temp=0;
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream.of(rotateArray(new int[]{1,2,3,4,5,6,7},3)).forEach(System.out::print);
		
	}

}
