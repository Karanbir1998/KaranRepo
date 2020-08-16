package Assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment1_Excel {

	public static void ReadDataBasedUponRowNoAndColumnNo(int columnmethod, int rowmethod) throws BiffException, IOException {
		File f=new File("../File_Handling/Input1.xls");
		Workbook wr=Workbook.getWorkbook(f);
		Sheet s=wr.getSheet(0);
		Cell c=s.getCell(columnmethod-1, rowmethod-1);
		System.out.print("Result(Row,Column): "+c.getContents()+" ");	
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Total number of Rows and Column: 10");
		System.out.println();
		System.out.println("Enter the Cell details to show data of that cell");
		System.out.println();
		System.out.print("Enter the Row number of cell: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		ReadDataBasedUponRowNoAndColumnNo(c, r);

	}
	
}
