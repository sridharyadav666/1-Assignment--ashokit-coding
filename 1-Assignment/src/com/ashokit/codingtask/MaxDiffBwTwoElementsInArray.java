package com.ashokit.codingtask;

public class MaxDiffBwTwoElementsInArray {

	public static void main(String[] args) {
		int max=0;
		//int[] arr={ 2, 5, 1, 7, 3, 9, 5};
		int [] arr={ 9, 2, 12, 5, 4, 7, 3, 19, 5};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					max=Math.max(max, arr[j]-arr[i]);
				}
			}
		}
		System.out.println(max);
	}

}
