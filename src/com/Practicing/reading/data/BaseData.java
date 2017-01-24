package com.Practicing.reading.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseData {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public  BaseData(String datapath) throws IOException{
		
		File x = new File(datapath);
		FileInputStream fis = new FileInputStream(x);
		wb = new XSSFWorkbook(fis);
	}
		
		public String getData(int Sheetnumber, int row, int cell){
			sheet = wb.getSheetAt(Sheetnumber);
			String data = sheet.getRow(row).getCell(cell).getStringCellValue();
			return data;
		}
		
	}
		
	
	
	

