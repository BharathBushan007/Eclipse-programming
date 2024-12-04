package com.practice.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public String readDataFromExcel(int rownum, int colunum) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\User Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		String data = sheet.getRow(rownum).getCell(colunum).toString();
		return data;
	}

}
