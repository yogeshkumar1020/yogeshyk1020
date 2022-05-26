package week3;

import java.util.Arrays;

public class day2learnarray {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7,8,9,10};
	int value=arr.length;
	System.out.println("The value is : "+value);
	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
