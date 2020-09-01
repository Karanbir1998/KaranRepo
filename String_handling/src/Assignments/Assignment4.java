package Assignments;
public class Assignment4 {

	public static void main(String[] args) {
		String name="my name is Karanbir";
		String[] s=name.split(" ");
		int a=s.length;
		String third="",second;
		for(int i=a-1;i>=0;i--) 
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
