package com.datastructure.arrays;

public class SortedArrayRemove {
	
	private static int removeDuplicates(int[] a) {
		int j=0;
		if(a==null && a.length==0) {
			return 0;
		}else {
			
			for(int i=1;i<a.length;i++) {
				if(a[j]!=a[i]) {
					j++;
					a[j]=a[i];
					
				}
			}
		}
		
		return j+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,1,1,1,2,3,4,4,5};
		int len=removeDuplicates(a);
		for(int i=0;i<len;i++ ) {
			System.out.println(a[i]);
		}

	}

}
