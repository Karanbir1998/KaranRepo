package Assignments;
import java.util.Scanner;
public class Assignment7 {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String: ");
	String name=sc.nextLine();
	String[] s=name.split(" ");
	int a=s.length;
	int count=0;
	System.out.println();
	System.out.print("Enter the word to find how the occurence: ");
	String second=sc.next();
	for(int i=0;i<a;i++){
		if(s[i].contentEquals(second)){
			count++;
		}
	}
	System.out.println();
	System.out.print("occurence of '"+second+"' in string is: "+count);
	sc.close();
	}
}
