package com.datastructure.arrays;

public class MoveFrontZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1, 0, 0, 0, 2, 3, 4, 4, 5 };
		moveBackZero(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	private static void moveBackZero(int[] a) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		if(a!=null && a.length!=0)
		{   
			while(j<a.length) {
				if(a[j]!=0) {
					a[i++]=a[j];
				}
				j++;
			}
		}
		while(i<a.length) {
			a[i++]=0;
			
		}
		
	}

}
