package com.ashokit.codingtask;

public class FindCommonElementsIn3Arrays {

	public static void main(String[] args) {
		int x=0; int y=0; int z=0;
		
		int[] arr1= {1, 5, 10, 20, 40, 80};
		int[] arr2= {6, 7, 20, 80, 100};
		int[] arr3= {3, 4, 15, 20, 30, 70, 80, 120};
		
		
		while(x<arr1.length && y<arr2.length && z<arr3.length) {
			
			if(arr1[x]==arr2[y] && arr2[y]==arr3[z]) {
				System.out.println(arr1[x]);
				x++;
				y++;
				z++;
			}else if(arr1[x]>arr2[y]) {
				y++;
			}else if(arr2[y]>arr3[z]) {
				z++;
			}else {
				x++;
			}
			
		}
	}

}
