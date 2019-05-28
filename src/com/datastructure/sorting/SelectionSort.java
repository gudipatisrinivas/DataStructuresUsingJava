package com.datastructure.sorting;

import java.util.stream.IntStream;

public class SelectionSort {
	
	private static int[] SelectionSort(int[] a) {
		int temp = Integer.MAX_VALUE, k = 0;
		if (a.length < 2) {
			return a;
		} else {
			for (int i = 0; i < a.length; i++) {
				temp=Integer.MAX_VALUE;
				for (int j = i+1; j < a.length ; j++) {
					if ( a[j]<temp) {
						temp = a[j];
						k = j;
					}
				}
				temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.of(SelectionSort(new int[]{5,4,3,2,1})).forEach(System.out::print);
		System.out.println();
		IntStream.of(SelectionSort(new int[]{-5,-4,-3,-2,-1})).forEach(System.out::print);;
		System.out.println();
		
		IntStream.of(SelectionSort(new int[]{-5,4,-3,2,-1})).forEach(System.out::print);;
		System.out.println();
		
		IntStream.of(SelectionSort(new int[]{0,0,0,0,1,-9,-8})).forEach(System.out::print);;

	}

}
