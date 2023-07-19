package ExcelHandle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeonexcel 
{

	public static void main(String[] args) throws IOException
	{

		XSSFWorkbook Workbook=new XSSFWorkbook();
		XSSFSheet sheet=Workbook.createSheet("Rough work");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hi");
		sheet.getRow(0).createCell(1).setCellValue("Hello");
		sheet.getRow(0).createCell(2).setCellValue("How");
		sheet.getRow(0).createCell(3).setCellValue("Are");
		sheet.getRow(0).createCell(4).setCellValue("you");

		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("I");
		sheet.getRow(1).createCell(1).setCellValue("am");
		sheet.getRow(1).createCell(2).setCellValue("fine");
		sheet.getRow(1).createCell(3).setCellValue("and");
		sheet.getRow(1).createCell(4).setCellValue("you");

		File file=new File("C:\\ExcelWrite\\rough work1.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		Workbook.write(fos);
		Workbook.close();

	}
}
