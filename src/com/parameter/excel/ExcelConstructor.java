package com.parameter.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConstructor {
XSSFWorkbook wb;
XSSFSheet sheet;
	
	public ExcelConstructor(String excelpath) throws IOException
	{
		File src = new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		
		
	}
		
	public String getData(int sheetNumber, int row, int column){
		sheet =wb.getSheetAt(sheetNumber);
		String data =sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	
}
