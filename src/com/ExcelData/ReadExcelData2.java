package com.ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData2 {

	public static void main(String[] args) throws IOException {

		File src = new File("C:\\Users\\vniki\\workspace\\Train\\UserData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
		
	/*	int rowcount = sheet1.getLastRowNum();
		System.out.println(rowcount);
		for(int i=0;i<rowcount;i++)
		{
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Username is "+data0);
			System.out.println("Password is "+data1);
		}*/
	wb.close();
	
	}

}
