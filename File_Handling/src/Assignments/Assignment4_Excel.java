package Assignments;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment4_Excel {

public void WriteDataBasedOnRowAndColumn(int startrow,int endrow, int startcolumn, int endcolumn) throws IOException, RowsExceededException, WriteException {
		File f=new File("../File_Handling/Write.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet s=wk.createSheet("Write", 0);
		String enter="";
		for(int i=startrow-1;i<endrow;i++) {
			for(int j=startcolumn-1;j<endcolumn;j++) {
				Scanner a=new Scanner(System.in);
				System.out.print("(Column,Row)=("+(j+1)+","+(i+1)+") : ");
				enter=a.nextLine();
				Label l=new Label(j,i,enter);
				s.addCell(l);
				}
			}	
		wk.write();
		wk.close();
	}
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter range in which you want to print the data");
		System.out.println();
		Assignment4_Excel obj=new Assignment4_Excel();
		System.out.print("Enter the Start row: ");
		int start=a.nextInt();
		System.out.print("Enter the End row: ");
		int end=a.nextInt();
		System.out.print("Enter the Start column: ");
		int start2=a.nextInt();
		System.out.print("Enter the End column: ");
		int end2=a.nextInt();
		obj.WriteDataBasedOnRowAndColumn(start, end, start2, end2);
		System.out.println("Success");
	}
}
