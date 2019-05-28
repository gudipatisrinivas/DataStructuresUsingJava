package com.datastructure.sorting;

import java.util.stream.IntStream;

public class BubbleSort {
	
	private static int[] bubbleSort(int[] a) {
		if(a.length<2) {
			return a ;
		}else {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length-1;j++) {
					
				if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
				}
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.of(bubbleSort(new int[]{5,4,3,2,1})).forEach(System.out::print);
		System.out.println();
		IntStream.of(bubbleSort(new int[]{-5,-4,-3,-2,-1})).forEach(System.out::print);;
		System.out.println();
		
		IntStream.of(bubbleSort(new int[]{-5,4,-3,2,-1})).forEach(System.out::print);;
		System.out.println();
		
		IntStream.of(bubbleSort(new int[]{0,0,0,0,1,-9,-8})).forEach(System.out::print);;

	}

}
