package org.startupapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstStep {
	public static void main(String[] args) throws IOException {

		File f = new File("D:\\error\\jjjj.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(stream);
		Sheet createSheet = book.createSheet("Jaa");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("JAGAN");
		Row createRow2 = createSheet.createRow(1);
		Cell createCell2 = createRow2.createCell(0);
		createCell2.setCellValue("Hari");
		FileOutputStream out = new FileOutputStream(f);
		book.write(out);

	}
}
