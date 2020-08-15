package com.ashokit.codingtask;

import java.util.Arrays;

public class FindThirdHighestValuesInArray {

	public static void main(String[] args) {
		
		//int[] arr={ 6, 8, 1, 9, 2, 1, 10,12};

		int[] arr={6};

		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-3]);
	}

}
