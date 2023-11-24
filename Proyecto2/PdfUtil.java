/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IngreSistema;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.util.List;

public class PdfUtil {

    public static void generarPDF(List<ResultadoCalculo> resultados, String filePath) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            // Agregar contenido al PDF
            document.add(new Paragraph("Resultados de Cálculos\n\n"));

            for (ResultadoCalculo resultado : resultados) {
                document.add(new Paragraph("Tipo de Cálculo: " + resultado.getTipoCalculo()));
                document.add(new Paragraph("Valores Utilizados: " + resultado.getValoresUtilizados()));
                document.add(new Paragraph("Resultado: " + resultado.getResultado() + "\n\n"));
            }

        } catch (DocumentException | java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (document != null && document.isOpen()) {
                document.close();
            }
        }
    }
}




