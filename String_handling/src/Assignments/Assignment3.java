package Assignments;
public class Assignment3 {

	public static void main(String[] args) {
		String name="my name is Karanbir";
		String[] s=name.split(" ");
		int length=s.length;
		String third="",second;
		for(int i=0;i<length;i++) 
		{
			second=s[i];
			int b=second.length();
				for(int j=b-1;j>=0;j--) {
					third=third+second.charAt(j);
				}
				System.out.print(third+" ");
				third="";
		}
	}	
}
