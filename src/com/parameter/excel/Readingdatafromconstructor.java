package com.parameter.excel;

import java.io.IOException;

public class Readingdatafromconstructor {

	public static void main(String[] args) throws IOException {
		
		ExcelConstructor x = new ExcelConstructor("C:\\Users\\vniki\\workspace\\Train\\UserData.xlsx");
		
		System.out.println(x.getData(0,1,1));
	}

}
