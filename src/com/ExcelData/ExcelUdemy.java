package com.ExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUdemy {
	public static XSSFWorkbook wb;
	public static XSSFRow row;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static FileInputStream fis;
	
	public static void main(String[] args) throws IOException {
	String value =getdata(1,1);
	System.out.println(value);
	String value1 =getdata(0,1);
	System.out.println(value1);
	String value2 =setnewdata(2,1);
	System.out.println(value2);
	}
	public static String getdata(int rownum, int cellno) throws IOException{
		fis = new FileInputStream("C:\\Users\\vniki\\workspace\\Train\\UserData.xlsx");
		wb = new XSSFWorkbook(fis);
		 sheet = wb.getSheet("Script");
		int x = sheet.getPhysicalNumberOfRows();
		 System.out.println(x);
	 row = sheet.getRow(rownum);
	 cell = row.getCell(cellno);
	return cell.getStringCellValue();
	}
	
	public static String setnewdata(int rownum, int cellno) throws IOException{
		fis = new FileInputStream("C:\\Users\\vniki\\workspace\\Train\\UserData.xlsx");
		wb = new XSSFWorkbook(fis);
	 sheet = wb.getSheet("Script");
	 row = sheet.getRow(rownum);
	 cell = row.getCell(cellno);
	 cell.setCellValue("ABC");
	 String cellinfo = cell.getStringCellValue();
	return cellinfo;
	}
}
