package com.ashokit.codingtask;

import java.util.Arrays;

public class FindMInMaxElementsInArray {

	public static void main(String[] args) {
		
		int[] arr= {1, 2, 5, 5, 6, 6, 7, 2};
		
		Arrays.sort(arr);
		
		System.out.println("Min value in array is  :"+arr[0]);
		System.out.println();
		System.out.println();
		System.out.println("Max value in Array is  :"+arr[arr.length-1]);

	}

}
