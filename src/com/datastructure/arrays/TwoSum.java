package com.datastructure.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	private static HashMap<Integer,Integer> twoSum(int[] a,int target) {
		HashMap<Integer, Integer> hashMap=new HashMap<>();
		Arrays.sort(a);
		int start=0,end=a.length-1;
		while(start<end) {
			if(target-a[start]>a[end]) {
				start++;
			}else if(target-a[start]<a[end]) {
				end--;
			}else if(target-a[start]==a[end]) {
				hashMap.put(a[start],a[end]);
				start++;
				end--;
			}
			
		}	
		
		
		return hashMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(twoSum(new int[] {1,2, 3,4,5,6,7},8));
		System.out.println(twoSum(new int[] {4,4,4,4,4,4,2,6},8));
	}

}
