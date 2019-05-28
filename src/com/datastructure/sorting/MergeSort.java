package com.datastructure.sorting;

import java.util.stream.IntStream;

public class MergeSort {
	
	private static int[] mergeSort(int[] a) {
		return mergeSort(a,0,a.length);
	}

	private static int[] mergeSort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		
		if(end>start) {
			int mid=(start+end)/2;
			
			mergeSort(a,start,mid);
			mergeSort(a, mid+1, end);
			a=merge(a,start,mid,end);
			
		}
		return a;
	}

	private static int[] merge(int[] a, int start, int mid, int end) {
		// TODO Auto-generated method stub
		
		int[] left=new int[mid+1];
		int[] right=new int[end-mid];
		int n1=mid-start+1;
		int n2=end-mid;
		for(int i=0;i<n1;i++){
			left[i]=a[start+1];
		}
		for(int i=0;i<n2;i++){
			right[i]=a[mid+1+i];
		}
		int i=0,j=0;
		int k=start;
		while(i<n1 && j<n2) {
			if(left[i]<right[j]) {
				a[k]=left[i];
				i++;
			}else {
				a[k]=left[i];
				j++;
			}
			k++;
		}
		while(i<n1) {
		a[k]=left[i];
		i++;
		k++;
		}
		while(j<n2)
		{
			a[j]=left[j];
			j++;
			k++;
				
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.of(mergeSort(new int[]{5,4,3,2,1})).forEach(System.out::print);
		System.out.println();
		IntStream.of(mergeSort(new int[]{-5,-4,-3,-2,-1})).forEach(System.out::print);;
		System.out.println();
		
		IntStream.of(mergeSort(new int[]{-5,4,-3,2,-1})).forEach(System.out::print);;
		System.out.println();
		
		IntStream.of(mergeSort(new int[]{0,0,0,0,1,-9,-8})).forEach(System.out::print);;


	}

}
