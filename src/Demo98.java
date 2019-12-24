import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo98 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
			Demo98.getData(0, 1);
			Demo98.getData(0, 2);
			Demo98.getData(0, 3);
		}
		
		
		
		public static void getData(int r, int c) throws EncryptedDocumentException, InvalidFormatException, IOException 
		{
		FileInputStream fis=new FileInputStream("C:\\Users\\Ram\\Desktop\\ram.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row r1=sh.getRow(r);
		Cell c1=r1.getCell(c);
		String str=c1.getStringCellValue();
		System.out.println(str);
		
	}

}
