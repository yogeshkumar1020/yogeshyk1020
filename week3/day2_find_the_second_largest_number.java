package week3;

import java.util.Arrays;

public class day2_find_the_second_largest_number {
	public static void main(String[] args) {
		int[] arr= {2,99,45,22,3333,453,12,77,88,123};
		int total=arr.length;
		System.out.println("The value is :"+total);
		Arrays.sort(arr);
		
		System.out.println(arr[total-2]);
			
		}
	}
