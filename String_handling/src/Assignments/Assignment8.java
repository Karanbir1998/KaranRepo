package Assignments;
public class Assignment8 {

	public static void main(String[] args) {
	String digit="1010101010";
	System.out.println("String: "+digit);
	System.out.println();
	int a=digit.length();
	String first="",second="",last;
	for(int i=0;i<a;i++) {
		if(digit.charAt(i)=='1') {
			first+=digit.charAt(i);
		}
		else {
			second+=digit.charAt(i);
		}
	}
	last=first+second;
	System.out.println("Output: "+last);
	}
}
