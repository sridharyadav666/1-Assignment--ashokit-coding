package com.ashokit.codingtask;

import java.util.HashSet;
import java.util.Set;

public class FindSumOfUniqueElements {

	public static void main(String[] args) {
		int sum=0;
		int[] arr={1, 6, 4, 3, 2, 2, 3, 8, 1};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
				
			}
		}
		
			for (Integer integer : set) {
				
				
				sum=sum+integer;
				
			}
			System.out.println(sum);
		}
		}
		
	