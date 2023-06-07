package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet 
{
	public static String getExcelSheetData(int row, int cell) throws EncryptedDocumentException, IOException 
	{
		String data;
		FileInputStream excel = new FileInputStream("C:/Users/Sayali Chiplunkar/OneDrive/Documents/eclipse/Printhub/Excel/ABC.xlsx");
		Sheet InputData = (Sheet) WorkbookFactory.create(excel).getSheet("Sheet1");
		try {
			data = InputData.getRow(row).getCell(cell).getStringCellValue();
		}
		catch(Exception e)
		{
			long inputdata=(long)InputData.getRow(row).getCell(cell).getNumericCellValue();
			data= ""+inputdata;
		}
		return data;
	}

}
