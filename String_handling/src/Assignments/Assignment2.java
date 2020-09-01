package Assignments;

public class Assignment2 {

	public static void main(String[] args) {
		String name="My name is Karanbir";
		String[] s=name.split(" ");
		int a=s.length;
		for(int i=a-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
	}
}
