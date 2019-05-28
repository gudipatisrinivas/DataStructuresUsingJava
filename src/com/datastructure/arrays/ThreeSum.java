package com.datastructure.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
	private static List<List<Integer>> threeSum(int[] nums,int target) {
		 List<List<Integer>> res = new ArrayList<>();
			
			if(nums.length <= 2) { return res;}
			
			//Sort the array
			Arrays.sort(nums);
			
			int i = 0;
			while(i < nums.length) {	
				
				int Lo = i + 1;
				int Hi = nums.length - 1;
				
				while(Lo < Hi) {
					int Sum = nums[i] + nums[Lo] + nums[Hi];
					
					if(Sum == 0) {
						List<Integer> foundList = new ArrayList<Integer>();
						foundList.add(nums[i]);
						foundList.add(nums[Lo]);
						foundList.add(nums[Hi]);
						res.add(foundList);					
					}
					
					if(Sum <= 0) {
						Lo++;
						while( Lo < Hi && nums[Lo] == nums[Lo -1]) {Lo++; }
					}
					else {
						Hi--;
						while(Lo < Hi && nums[Hi] == nums[Hi +1]) {Hi--; }
					}
				}
				
				i++;
				while(i < nums.length && nums[i] == nums[i -1]) {
					i++;
				}
				
			}		
			return res;	
	    }
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(threeSum(new int[] {-1, 0, 1, 2, -1, -4},0));

	}

}
