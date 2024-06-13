package com.interview.lists;

import java.util.Arrays;

//compare two arrays element equals or not but order does not matter
public class ArraysEquals {
	public static void main(String[] args) {
		int[] arr1= {3,2,7,5};
		int[] arr2= {3,2,7,5};

		int[] arr3= {5,3,7,5};
		//when order of element is same then we can use it
		boolean res=Arrays.equals(arr1, arr2);
		System.out.println(res);
        if(equalsArray(arr1,arr3)){
        	System.out.println("equal");
        }
        else {
        	System.out.println("Not equal");

        }

	}

	private static boolean equalsArray(int[] arr1, int[] arr2) {
		int n=arr1.length;
		int m=arr2.length;
			if(n!=m) {
				return false;
			}
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0;i<n;i++) {
				if(arr1[i]!=arr2[i]) {
					return false;
				}
			}
	
			return true;
	}
}
