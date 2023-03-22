package org.bas.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Veni\\eclipse-workspace\\MavenProject\\Excel\\Book1.xlsx");
		
	FileInputStream input = new FileInputStream(f);

Workbook w =new XSSFWorkbook(input);
	
	
	Sheet s = w.getSheetAt(0);

	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		
		Row r = s.getRow(i);
		
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
		
			Cell c = r.getCell(j);
			System.out.println(c);
			
		}
		
		
		
		
		
	}



	}
		

	
}
