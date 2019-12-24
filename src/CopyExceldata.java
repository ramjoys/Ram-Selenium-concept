import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CopyExceldata {
	
	public static String sourceFile="C:\\automation\\ram.xlsx";
	public static String targetFile="C:\\automation\\ram1.xlsx";

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis1=new FileInputStream(sourceFile);
		FileInputStream fis2=new FileInputStream(targetFile);
		Workbook wb1=WorkbookFactory.create(fis1);
		Workbook wb2=WorkbookFactory.create(fis2);
		
		int sheetlenght= wb1.getNumberOfSheets();
		System.out.println(sheetlenght);
		
		int defaultsheet = wb2.getSheetIndex("Sheet1");
		
		wb2.removeSheetAt(defaultsheet);
			
		
		for (int z=0;z<sheetlenght;z++)
		{
		
			Sheet sheet1=wb1.getSheetAt(z);
			String sheetname=wb1.getSheetName(z);
			
			
		    Sheet sheet2=wb2.createSheet(sheetname);
		    int length = sheet1.getLastRowNum();
		
		for ( int i=0;i<=length;i++)
					{
			int columnlength=sheet1.getRow(i).getLastCellNum();
			
			Row row2=sheet2.createRow(i);
			
		    for(int j=0;j<columnlength;j++)
		    {
			
		String value=sheet1.getRow(i).getCell(j).getStringCellValue();
		
		row2.createCell(j).setCellValue(value);
		
		
	}
		    
		}
		}
		 FileOutputStream outFile = new FileOutputStream("C:\\automation\\ram1.xlsx");
		 wb2.write(outFile);
		 outFile.close();
		 System.out.println("Excel copy is completed");
		

	}
}
