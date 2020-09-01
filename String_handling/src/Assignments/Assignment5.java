package Assignments;
public class Assignment5 {

	public static void main(String[] args) {
		String name="My name is Karanbir";
		System.out.println(name);
		int size=name.length();
		int count=0;
		for(int i=0;i<size;i++) 
		{
			if(name.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("Occurence of a in String is: "+count);
	}
}	
