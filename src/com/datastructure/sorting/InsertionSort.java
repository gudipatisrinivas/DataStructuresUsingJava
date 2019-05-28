package com.datastructure.sorting;

import java.util.stream.IntStream;

public class InsertionSort {
	
	private static int[] insertionSort(int[] a) {
		// int temp = Integer.MAX_VALUE, k = 0;
		if (a.length < 2) {
			return a;
		} else {
			for (int i = 0; i < a.length; i++) {
				int key = a[i];
				int j = i - 1;
				while (j > -1 && a[j] > key) {
					a[j + 1] = a[j];
					j = j - 1;
				}

				a[j + 1] = key;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.of(insertionSort(new int[]{5,4,3,2,1})).forEach(System.out::print);
		System.out.println();
		IntStream.of(insertionSort(new int[]{-5,-4,-3,-2,-1})).forEach(System.out::print);;
		System.out.println();
		
		IntStream.of(insertionSort(new int[]{-5,4,-3,2,-1})).forEach(System.out::print);;
		System.out.println();
		
		IntStream.of(insertionSort(new int[]{0,0,0,0,1,-9,-8})).forEach(System.out::print);;

	}

}
