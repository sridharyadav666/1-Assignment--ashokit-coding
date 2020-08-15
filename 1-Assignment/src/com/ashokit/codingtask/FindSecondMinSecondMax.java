package com.ashokit.codingtask;

import java.util.Arrays;

public class FindSecondMinSecondMax {

	public static void main(String[] args) {
		
		int[] arr= {1, 2, 5, 9, 6, 4, 7, 2};
		
		Arrays.sort(arr);
		
		System.out.println("Second min value in array is  :"+arr[2]);
		System.out.println("Second max value in array is :"+arr[arr.length-2]);
	}

}
