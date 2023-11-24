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

public class CalculosElectricidad {

    private List<ResultadoCalculo> resultados;

    public CalculosElectricidad() {
        resultados = new ArrayList<>();
    }

    public double calcularPotencia(double voltaje, double corriente) {
        return voltaje * corriente;
        
    }

    public double calcularVoltaje(double corriente, double resistencia) {
        return corriente * resistencia;
    }
    
    public double calcularResistencia(double voltaje, double corriente) {
    return voltaje / corriente;
   }

    public double calcularCorriente(double voltaje, double resistencia) {
        return voltaje / resistencia;
    }
   
            

    public void almacenarResultado(String tipoCalculo, String valoresUtilizados, double resultado) {
        ResultadoCalculo resultadoCalculo = new ResultadoCalculo(tipoCalculo, valoresUtilizados, resultado);
        resultados.add(resultadoCalculo);
    }

    public List<ResultadoCalculo> getResultados() {
        return resultados;
    }
}

