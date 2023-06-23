package AllImp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataProvider {
	@Test
	public void test() throws IOException {
		
	//	C:\Users\pkrai\Downloads
//		String path="C:\\Users\\pkrai\\Downloads\\file_example_XLS_10.xls";
		String path="C:\\Users\\pkrai\\Downloads\\Book.xlsx";
		FileInputStream fis=new FileInputStream(new File(path));
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		XSSFRow row=sheet.getRow(0);
		int colCount=row.getLastCellNum();
		System.out.println("rowCount  :"+rowCount);
		System.out.println("colCount  :"+colCount);
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
			XSSFCell	cell=sheet.getRow(i).getCell(j);
				cell.setCellType(CellType.STRING);
				System.out.println(cell.getStringCellValue());
			}
			
		}
		
	}

}
