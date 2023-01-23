package com.crm.acttime.generic_library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddatafromExcel {
public String readdatafromexcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./TestData/Testdata.xlsx");
Workbook wb = WorkbookFactory.create(fis);
String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
return data;
}
}
//./TestData/Testdata.xlsx