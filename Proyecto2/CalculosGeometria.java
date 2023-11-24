/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IngreSistema;

/**
 *
 * @author angel
 */
import java.util.ArrayList;
import java.util.List;

public class CalculosGeometria {

    private List<ResultadoCalculo> resultados;

    public CalculosGeometria() {
        resultados = new ArrayList<>();
    }

    public double calcularAreaRombo(double diagonalMayor, double diagonalMenor) {
        return diagonalMayor * diagonalMenor;
       
    }

    public double calcularAreaPoligono(double perimetro, double apotema) {
       return (perimetro * apotema) / 2;
      
    }
    
    public double calcularAreaRomboide(double altura, double baseMayor, double baseMenor) {
         return altura * (baseMayor * baseMenor) / 2;
    }


    public void almacenarResultado(String tipoCalculo, String valoresUtilizados, double resultado) {
        ResultadoCalculo resultadoCalculo = new ResultadoCalculo(tipoCalculo, valoresUtilizados, resultado);
        resultados.add(resultadoCalculo);
    }

    public List<ResultadoCalculo> getResultados() {
        return resultados;
    }
}

