package week1day4;

public class ArmstrongNumber {
public static void main(String[] args) {
	int input =153,sum=0,rem;
	int orgnum=input;
	while (orgnum>0) {
		rem=orgnum%10;
		sum=sum+rem*rem*rem;
		orgnum = orgnum/10;
	}
	if(sum == input) {
		System.out.println("it is an armstrong number");
	}
	else {
		System.out.println("it is not an armstrong number");
	}
	
}
}
