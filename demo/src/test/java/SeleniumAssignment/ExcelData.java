package SeleniumAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {
	@Test
	public void printExcel() throws IOException{

		File file = new File("C:\\Users\\User\\Desktop\\User Data.xlsx");
		FileInputStream fs = new FileInputStream(file);

				Random random = new Random();
				int rm = random.nextInt(7);
			System.out.println(rm);

		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheetName = workbook.getSheet("Sheet1");
		String username = sheetName.getRow(rm).getCell(0).getStringCellValue();

		String password = null;

		password = sheetName.getRow(rm).getCell(1).getStringCellValue();



		System.out.println(username+" "+password);


	}
}
