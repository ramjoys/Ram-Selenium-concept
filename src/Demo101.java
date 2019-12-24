import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo101 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Ram\\Desktop\\ram1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("RPA").createRow(0).createCell(4).setCellValue("rpa11");
		wb.write(new FileOutputStream("C:\\Users\\Ram\\Desktop\\ram1.xlsx"));

	}

}
