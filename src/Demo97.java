import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Demo97 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Ram\\Desktop\\ram.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String str=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		double strr=wb.getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
		System.out.println(str);
		System.out.println(strr);

	}

}
