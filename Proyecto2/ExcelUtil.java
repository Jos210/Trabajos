/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IngreSistema;

/**
 *
 * @author Josue
 */

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelUtil {
    
     public static void generarExcel(List<ResultadoCalculo> resultados, String filePath) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Resultados");

            // Encabezados de las columnas
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Tipo de Cálculo");
            headerRow.createCell(1).setCellValue("Valores Utilizados");
            headerRow.createCell(2).setCellValue("Resultado");

            // Llenar el archivo con los resultados
            int rowNum = 1;
            for (ResultadoCalculo resultado : resultados) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(resultado.getTipoCalculo());
                row.createCell(1).setCellValue(resultado.getValoresUtilizados());
                row.createCell(2).setCellValue(resultado.getResultado());
            }

            // Escribir el libro en un archivo
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }
        } catch (IOException e) {
        }
    }
    
}
