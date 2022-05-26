package week3;

public class day2_duplicate {
public static void main(String[] args) {
	int arr[] = {2,3,4,5,6,7,3,2,4,5,6,33,88,99,66};
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				System.out.println(arr[j]);
			}
		}
	}
}
}
