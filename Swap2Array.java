package com.interview.lists;

public class Swap2Array {
	public static void main(String[] args) {
		int arr1[]= {11,12,13};
		int arr2[]= {3,4,5};
		swap(arr1,arr2);
	}

	private static void swap(int[] arr1, int[] arr2) {
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=arr1[i]+arr2[i];
			arr2[i]=arr1[i]-arr2[i];
			arr1[i]=arr1[i]-arr2[i];
		}
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println();

		for(int j:arr2) {
			System.out.print(j+" ");
		}
	}
}
