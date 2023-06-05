package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\THIS PC\\eclipse-workspace\\CucumberOnePm\\Excel\\UserData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		for (int i = 0; i < 4; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < 2; j++) {
				XSSFCell cell = row.getCell(j);

				String cellData = cell.getStringCellValue();

				System.out.println(cellData);
			}
		}
	}

}
