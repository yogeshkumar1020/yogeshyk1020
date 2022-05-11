package week1day4;

public class PrimeNumber {
public static void main(String[] args) {
	int input=13;
	int count=0;
	for (int i = 1; i <=input; i++) {
		if(input%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println("given number is prime");
	}
	else {
		System.out.println("given number is not a prime number");
	}
		
}
}
