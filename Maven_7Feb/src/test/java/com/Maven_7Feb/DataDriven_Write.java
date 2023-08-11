package com.Maven_7Feb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Write {

	public static void Data_Write() throws IOException {
		File fname= new File("C:\\Users\\Nancy Lawrence\\Desktop\\DataDriven.xlsx");
		FileInputStream fis= new FileInputStream(fname);
		Workbook wb= new XSSFWorkbook(fis);
		/*
#createSheet();
#createRow();
#createcell();
#setCellValue();
		 */
		wb.createSheet("Sheet2").createRow(2).createCell(1).setCellValue("Writing Data");
		FileOutputStream fos= new FileOutputStream(fname);
		wb.write(fos);
	}
	public static void main(String[] args) throws IOException {
		Data_Write();
		System.out.println("Data writing over");
	}

}
