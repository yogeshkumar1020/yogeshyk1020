package week1day4;

public class FibonanceSeries {
public static void main(String[] args) {
	int n=15;
	int f=0,s=1,t;
	System.out.println(f);
	System.out.println(s);
	for (int i = 3; i <=n; i++) {
		t=f+s;
		System.out.println(t);
		f=s;
		s=t;
	}
}
}
