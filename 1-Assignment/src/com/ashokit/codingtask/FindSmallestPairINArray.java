package com.ashokit.codingtask;

public class FindSmallestPairINArray {

	public static void main(String[] args) {
		
		int first,second;
		int arr[] = {1, 7, 2, 9, 6};
		
		if(arr[0] < arr[1]) {
			
			first=arr[0];
			second=arr[1];
		}else {
			first=arr[1];
			second=arr[0];
			
		}
		for(int i=2;i<arr.length;i++) {
			
			if(arr[i] < first) {
				
				second=first;
				first=arr[i];
			}else if(arr[i]<second&& arr[i] !=first)
				second=arr[i];
		}
System.out.println(first+second);
	}

}
