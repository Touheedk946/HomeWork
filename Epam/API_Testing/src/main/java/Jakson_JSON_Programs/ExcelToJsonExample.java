package Jakson_JSON_Programs;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelToJsonExample {
    public static void main(String[] args) throws Exception {
        Workbook workbook = WorkbookFactory.create(new File("input.xlsx"));
        Sheet sheet = workbook.getSheetAt(0);

        List<Map<String, Object>> excelData = new ArrayList<>();
        for (Row row : sheet) {
            Map<String, Object> rowData = new HashMap<>();
            for (Cell cell : row) {
                rowData.put("Column" + cell.getColumnIndex(), cell.toString());
            }
            excelData.add(rowData);
        }

        // Convert the Excel data to JSON
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(excelData);
        System.out.println(json);

        workbook.close();
    }
}

