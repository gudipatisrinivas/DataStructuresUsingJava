package com.datastructure.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
	private static List<List<Integer>> threeSum(int[] a,int target) {
		Arrays.sort(a);
	    ArrayList<List<Integer>> result = new ArrayList<>();
	    
	    for(int i=0;i<a.length;i++) {
	    	int j=i+1;
	    	int k=a.length-1;
	    	if(j<a.length && a[j]==a[j-1]) {
    			continue;
    		}
	    	//int sumTarget=target-a[i];
	    	while(j<k) {
	    		if(k<a.length && a[k]==a[k-1]) {
	    			k--;
	    			continue;
	    		}
	    		if(a[i]+a[j]+a[k]>target) {
	    			k--;
	    		}else if(a[i]+a[j]+a[k]<target) {
	    			j++;
	    		}else if(a[i]+a[j]+a[k]==0) {
	    			ArrayList<Integer> l=new ArrayList<>();
	    			l.add(a[i]);
	    			l.add(a[j]);
	    			l.add(a[k]);
	    			result.add(l);
	    			j++;
	    			k--;
	    			
	    		}
	    	}
	    }
		
		
		return result;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4},0));

	}

}
