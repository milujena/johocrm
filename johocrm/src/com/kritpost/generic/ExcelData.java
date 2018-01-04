package com.kritpost.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	//To get the data
			public static String getData(String file, String sheet, int rn, int cn)
			{
				try
				{
					FileInputStream fis = new FileInputStream(file);
					String data = WorkbookFactory.create(fis).getSheet(sheet).getRow(rn).getCell(cn).toString();
					return data;
				}
				catch(Exception e)
				{
					return "";
				}
			}
			
			//To set the data
					public static String wrightData(String file, String sheet, int rn, int cn,String data)
					{
						try
						{
							FileInputStream fis = new FileInputStream(file);
							Workbook wb = WorkbookFactory.create(fis);
							
							wb.getSheet(sheet).getRow(rn).createCell(cn).setCellValue(data);
							FileOutputStream fos=new FileOutputStream(file);
							wb.write(fos);
							return data;
						}
						catch(Exception e)
						{
							return "";
						}
						
					}
			
			//To get Row Count
				public static int getRow(String file, String sheet)
				{
					try
					{
						FileInputStream fis = new FileInputStream(file);
						int m = WorkbookFactory.create(fis).getSheet(sheet).getLastRowNum();
						return m;
					}
					catch(Exception e)
					{
						return 0;
					}
				}
				
				//To get Cell Count
				public static int getCell(String file, String sheet, int row)
				{
					try
					{
						FileInputStream fis = new FileInputStream(file);
						int m = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getLastCellNum();
						return m;
					}
					catch(Exception e)
					{
						return 0;
					}
				}
			
			
			

}
