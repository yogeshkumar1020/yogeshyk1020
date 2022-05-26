package week3;

import org.bouncycastle.util.Arrays;

public class day1reversearray {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,44,66,333};
	int total = arr.length;
	Arrays.reverse(arr);
	for (int i = arr.length-1; i >=0; i--) {
		System.out.println(arr[i]);
	}
}
}
