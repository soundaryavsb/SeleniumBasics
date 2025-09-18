package dataDrivenInterviewPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Part05_XSSFsheet {

	public static void main(String[] args) throws IOException {

		FileInputStream stream=new FileInputStream("C:\\DataDriven\\UserNamePasswordApachePOI.xlsx");
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet=workbook.getSheetAt(0);
		Iterator<Row> rowIterator=sheet.iterator();
		
		while (rowIterator.hasNext()) {
			Row rowvalues=rowIterator.next();
			Iterator<Cell> columnIterator=rowvalues.iterator();
		
			while (columnIterator.hasNext()) {
				Cell cellValue=columnIterator.next();
				System.out.print(cellValue.getStringCellValue());
			}
			
			System.out.println();
		}
	}
}
