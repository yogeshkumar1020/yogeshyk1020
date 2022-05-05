package week1day4;

public class ReturnExample {
	 public int add(int a,int b) {
		 int c=a+b;
		 System.out.println(c);
		 return c;
	 }
	 
	 public void sub(int a,int b) {
		int d=a-b;
		System.out.println(d);
	 }
		public static void main(String[] args) {
			ReturnExample ret=new ReturnExample();
			int x=ret.add(30,30);
			ret.sub(x,50);
		}

}
