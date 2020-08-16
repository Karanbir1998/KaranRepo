package Assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment3_Excel {

	public static void DataBasedUponRange(int initialrow, int endrow) throws BiffException, IOException {
	File f=new File("../File_Handling/Input1.xls");
	Workbook wr=Workbook.getWorkbook(f);
	Sheet s=wr.getSheet(0);
	int a=initialrow;
	for(int j=initialrow-1;j<endrow;j++) {
		System.out.println("Row number:"+a);
		for(int i=0;i<10;i++){
	    Cell c=s.getCell(i,j);
		System.out.print("    "+c.getContents());
		if(i==9) {
			System.out.println();
		}
		}
		a++;
		}
	}
	public static void main(String[] args) throws BiffException, IOException {
		File f=new File("../File_Handling/Input1.xls");
		Workbook wr=Workbook.getWorkbook(f);
		Sheet s=wr.getSheet(0);
		int a=s.getRows();
		int b=s.getColumns();
		Scanner sc=new Scanner(System.in);
		System.out.println("Total number of Rows is "+a+" and Columns is "+b);
		System.out.println();
		System.out.print("Enter initial row: ");
		int r=sc.nextInt();
		System.out.print("Enter end row: ");
		int re=sc.nextInt();
		DataBasedUponRange(r,re);
		sc.close();
	}
	
}
