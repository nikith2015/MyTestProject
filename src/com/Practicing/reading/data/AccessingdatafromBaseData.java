package com.Practicing.reading.data;

import java.io.IOException;



public class AccessingdatafromBaseData {

public static void main(String[] args) throws IOException {
		
		BaseData x = new BaseData("C:\\Users\\vniki\\workspace\\Train\\UserData.xlsx");
		
		System.out.println(x.getData(0,1,1));
	}

}
