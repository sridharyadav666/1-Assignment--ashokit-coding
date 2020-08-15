package com.ashokit.codingtask;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,5,5,6,6,7,2};
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length-1;i++) {
			
			if(map.containsKey(arr[i])) {
				
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		map.forEach((k,v) ->System.out.println(k +" ")); 
		
		
	}

}
