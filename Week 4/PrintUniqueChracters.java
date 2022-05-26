package week4;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueChracters {
public static void main(String[] args) {
	String input = "babub";
	char[] charArray = input.toCharArray();
	System.out.println(charArray);
	Set<String> val=new HashSet<String>();
	val.add("b");
	val.add("a");
	val.add("b");
	val.add("u");
	val.add("b");
	
	boolean remove = val.remove("b");
	System.out.println(remove);
	System.out.println(val);
}
}