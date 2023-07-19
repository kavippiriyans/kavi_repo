package ExcelHandle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandle 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream driver=new FileInputStream("C:\\ExcelHandling1\\Marksheet1.xlsx");
		XSSFWorkbook k=new XSSFWorkbook(driver);
		XSSFSheet j=k.getSheetAt(0);
		int row=j.getLastRowNum();
		int column=j.getRow(0).getLastCellNum();

		System.out.println("Row count = "+row);
		System.out.println("Column count = "+column);

		XSSFCell [][] array=new XSSFCell[row+1][column];

		for(int i=0;i<row+1;i++)
		{
			for(int c=0;c<column;c++)
			{
				array[i][c]=j.getRow(i).getCell(c);
			}
		}
		for(int i=0;i<row+1;i++)
		{
			for(int c=0;c<column;c++)
			{
				System.out.print(array[i][c]+"\t\t");
			}
			System.out.println();
		}
	}
}