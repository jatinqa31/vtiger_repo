package stepDefinations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileDemo  
{
	public static Map<String,  Map<String, String>> setMapData() throws IOException 
	{
		String path = "D://Login_credentials.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastRow = sheet.getLastRowNum();
		Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String,String>>();
		Map<String, String> dataMap = new HashMap<String, String>();
		
		//Looping over entire row
		for(int i=0; i<=lastRow; i++)
		{
			//System.out.println("lastrow = "+lastRow);
			Row row = sheet.getRow(i);
			
			Cell valueCell = row.getCell(i+1);//1st Cell as Value
			
			Cell keyCell = row.getCell(i);//0th Cell as Key
			
			String value = valueCell.getStringCellValue();//.trim();
			String key = keyCell.getStringCellValue();//.trim();
			//Putting key & value in dataMap
			dataMap.put(key, value);
			//Putting dataMap to excelFileMap
			excelFileMap.put("DataSheet", dataMap);
		}
			//Returning excelFileMap
			return excelFileMap;
	}
	
		//Method to retrieve value
		public static String getMapData(String key) throws IOException
		{
			Map<String, String> m = setMapData().get("DataSheet");
			String value = m.get(key);
			return value;
		}
		public static void main(String[] args) {
			maps r = new maps();
			
			Map<String, String> val;
			try {
				val = r.getTestDataInMap("D://Login_credentials.xlsx", "Sheet1", "Test_02");
				System.out.println("Value of the keyword (search) is- "+val.get("password"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("message " + e.getMessage());
			}
			
			
	 
		}
}  
