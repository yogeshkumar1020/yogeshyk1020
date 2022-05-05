package ArithmeticOperation;

public class ArithmeticOperation {
 public void add() {
	 System.out.println("Addition of two numbers");
 }
 public void sub( ) {
	 System.out.println("Subtraction of two numbers");
 }
 public void mul() {
	 System.out.println("Multification of two numbers");
 }
 public void div() {
	 System.out.println("Division of two numbers");
 }
 public static void main(String[] args) {
	 ArithmeticOperation Arithemetics=new ArithmeticOperation();
	 Arithemetics.add();
	 Arithemetics.sub();
	 Arithemetics.mul();
	 Arithemetics.div();
}
}
