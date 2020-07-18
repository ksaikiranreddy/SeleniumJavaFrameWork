package com.application.utilities.filehandlingutils;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelUtilities {
    FileInputStream fis;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    
    public ExcelUtilities(String path, String sheetName){
        try {
            fis = new FileInputStream(path);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);
        }catch (Exception e){
            e.getMessage();
        }
    }

    public int getRowCount(){
        int rowCount = sheet.getPhysicalNumberOfRows();
        return rowCount;
    }

    public int getColumnCount(){
        int columnCount = sheet.getRow(1).getPhysicalNumberOfCells();
        return columnCount;
    }

    public String getCellValue(int row, int column){
        String cellValue = sheet.getRow(row).getCell(column).getStringCellValue();
        return cellValue;
    }

    public Object[][] getExcelData(){
        int rowCount = getRowCount();
        int columnCount = getColumnCount();
        Object[][] data = new Object[rowCount-1][columnCount];
        for(int i=1; i<rowCount; i++){
            for(int j =0; j<columnCount;j++){
                data[i-1][j] = getCellValue(i, j);
            }
        }
        return data;
    }


}
