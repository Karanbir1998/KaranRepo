package Assignments;
import java.util.Scanner;
public class Assignment1 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String you want to Check That String is palindrome or not: ");
	String enter=sc.next();
	String abc="";
	System.out.println();
	int l=enter.length();
	for(int i=l-1;i>=0;i--) {
		abc=abc+enter.charAt(i);
	}
	if(abc.contentEquals(enter)) {
		System.out.println("Output: String is palindrome");
	}
	else {
		System.out.println("Output: Not palindrome");
	}
	sc.close();
}	
}
