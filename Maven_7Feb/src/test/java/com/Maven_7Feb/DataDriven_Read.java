package com.Maven_7Feb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Read {
	public static void particularData() throws IOException { //10Feb23
		//Method to read particular data from Excel Workbook
				/*
		1. Create an object for File and pass the parameters as .xlsx location
		2. Create an object for FileInputStream and pass the parameter
		3. Create an object for Workbook along with XSSFWorkbook and pass the parameter by using workbookrefname
		4. Create object for Sheet(getSheet), Row(getRow()), Cell(getCell()), CellType(getCellType())
				 */
		File fname= new File("C:\\Users\\Nancy Lawrence\\Desktop\\DataDriven.xlsx");
		FileInputStream fis= new FileInputStream(fname);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sheet= wb.getSheet("Sheet1");
		Row row= sheet.getRow(2);
		Cell cell= row.getCell(1);
		CellType cellType= cell.getCellType();
		System.out.println("cellType: "+cellType);
		
		if(cellType.equals(cellType.STRING)){
			String stringCellValue= cell.getStringCellValue();
			System.out.println("stringCellValue: "+stringCellValue);
		}else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue= cell.getNumericCellValue();
			System.out.println("numericCellValue: "+numericCellValue);
		}
	}
	
	
	
	
	
	public static void all_Data() throws IOException { //13Feb23
		//Method to read particular data from Excel Workbook
				/*
		1. Create an object for File and pass the parameters as .xlsx location
		2. Create an object for FileInputStream and pass the parameter
		3. Create an object for Workbook along with XSSFWorkbook and pass the parameter by using workbookrefname
		4. Create object for Sheet(getSheet), Row(getRow()), Cell(getCell()), CellType(getCellType())
				 */
		File fname= new File("C:\\Users\\Nancy Lawrence\\Desktop\\DataDriven.xlsx");
		FileInputStream fis= new FileInputStream(fname);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sheet= wb.getSheet("Sheet1");
		
		int physicalNumberOfRows= sheet.getPhysicalNumberOfRows();
		System.out.println("physicalNumberOfRows: "+physicalNumberOfRows);
		for(int i=0; i < physicalNumberOfRows; i++) {
			Row row= sheet.getRow(i);
			int physicalNumberOfCells= row.getPhysicalNumberOfCells();
			
			System.out.println("physicalNumberOfCells: "+physicalNumberOfCells);
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell= row.getCell(j);
				CellType cellType= cell.getCellType();
				//System.out.println("cellType: "+cellType);
				
				if(cellType.equals(cellType.STRING)){
					String stringCellValue= cell.getStringCellValue();
					System.out.println("stringCellValue: "+stringCellValue);
				}else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue= cell.getNumericCellValue();
					System.out.println("numericCellValue: "+numericCellValue);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		particularData();
		System.out.println("Reading Particular Data completed");
		all_Data();
		System.out.println("Reading All Data completed");
	}

}
