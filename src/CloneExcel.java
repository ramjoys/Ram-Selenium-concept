import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CloneExcel {
	
	public static String sourceFile="C:\\automation\\ram.xlsx";
	public static String targetFile="C:\\automation\\ram1.xlsx";

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
		
		FileInputStream fis1=new FileInputStream(sourceFile);
		Workbook wb1=WorkbookFactory.create(fis1);
		
		Sheet newSheet = wb1.cloneSheet(1);
		
		newSheet.getRow(0).getCell(0).setCellValue(893);
		
		wb1.write(new FileOutputStream("sourceFile"));
	
		
		
		
		

	}

}
