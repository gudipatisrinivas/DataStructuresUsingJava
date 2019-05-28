package com.datastructure.arrays;

import java.util.PriorityQueue;

public class FindKthLargest {
	
	public static int findKthLargest(int[] nums, int k) {
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
	    for(int i: nums){
	        q.offer(i);
	 
	        if(q.size()>k){
	            q.poll();
	        }
	    }
	 
	    return q.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findKthLargest(new int[] {1,2,3,4,5,6},2));
		//System.out.println(findKthLargest(new int[] {6,7,8,9,10,11},3));
		//System.out.println(findKthLargest(new int[] {5,6,7,9,12,13},2));
		

	}

}
