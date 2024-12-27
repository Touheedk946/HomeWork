package com.automation.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {

    public static Object[][] readExcelData(String filePath, String sheetName) {
        Object[][] data = null;

        try (FileInputStream fis = new FileInputStream(new File(filePath))) {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            int rows = sheet.getPhysicalNumberOfRows();
            int columns = sheet.getRow(0).getPhysicalNumberOfCells();

            data = new Object[rows - 1][columns]; // Exclude header row

            for (int i = 1; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
