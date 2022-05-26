package week3;

import java.util.Iterator;

public class day1newexample {
public static void main(String[] args) {
	int [] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	int var=arr.length;
	System.out.println(var);
	arr[2]=3;
	for (int j = 0; j < 19; j++) {
		System.out.print(arr[j]+",");
	}
}
}
