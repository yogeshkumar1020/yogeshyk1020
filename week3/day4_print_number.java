package week3;

import java.util.Iterator;
import java.util.Scanner;

public class day4_print_number {
public static void main(String[] args) {
	String text="Amazon has more than 17865 employees in chennai";
	String replace=text.replaceAll("\\D","");
	System.out.println(replace);
	
	String text1=" Anand uh...!!";
	char[] chararray=text1.toCharArray();
	System.out.println(chararray);	
	
	String text2=" Anand..uh...!! sevutu payaluku ";
	
	String[] split = text2.split(" ");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	
	Scanner scan = new Scanner(System.in);
	System.out.println(" kaadhey keaka maatudhu ");
     String nextline=scan.nextLine();
     System.out.println(nextline);

     Scanner scan=new scanner(System.in);
     
     
}             
}

