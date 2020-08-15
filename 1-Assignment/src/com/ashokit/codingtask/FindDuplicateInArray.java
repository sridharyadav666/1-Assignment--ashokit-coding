package com.ashokit.codingtask;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,5,5,6,6,7,2};
		
		/*for(int i=0 ;i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println("Duplicatie element in Array is  :"+arr[j]);
				}
			}
			
			
		}*/
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0; i < arr.length; i++) {
			
			if(set.contains(arr[i])) {
				
			System.out.println("Duplicate Value in Given array is  :"+arr[i]);
			}else {
				set.add(arr[i]);
			
			}
		}
	}

}
