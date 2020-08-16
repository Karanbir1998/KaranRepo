package Assignments;
import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment5_Excel {

public static void CopyAndPaste() throws BiffException, IOException, RowsExceededException, WriteException {
		File f=new File("../File_Handling/Write.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet(0);
		File f1=new File("../File_Handling/CopyAndPaste.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f1);
		WritableSheet wbs=wk.createSheet("CopyAndPaste", 0);
		int r=s.getRows();
		int c=s.getColumns();
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++) {
				Cell cl=s.getCell(j, i);
				String abc=cl.getContents();
				Label l=new Label(j,i,abc);
				wbs.addCell(l);
	}
	}
		wk.write();
		wk.close();
		
	}
public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		CopyAndPaste();
		System.out.println("Note: Data of 'Write' file gets Pasted successfully check 'CopyAndPaste' Excel File");
	}
}
