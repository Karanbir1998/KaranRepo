package Assignments;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class Assignment2_Excel {
	public static void ReadDataBasedUponRowNumber(int row) throws BiffException, IOException {
		File f=new File("../File_Handling/Input1.xls");
		Workbook wr=Workbook.getWorkbook(f);
		Sheet s=wr.getSheet(0);
		for(int i=0;i<10;i++) {
			Cell c=s.getCell(i, row);
			System.out.print("Row no: "+(row+1)+" Column no: "+(i+1)+" Data: "+c.getContents());
			System.out.println();
		}
		}
public static void main(String[] args) throws BiffException, IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("Total number of Rows and Column: 10");
		System.out.println();
		System.out.print("Enter the row number which you want to print: ");
		int r=s.nextInt();
		System.out.println();
		if(r<=10 && r>0) {
			ReadDataBasedUponRowNumber(r-1);	
		}
		else {
			System.out.println("Enter Valid Row number");
		}
		s.close();
	}
}
