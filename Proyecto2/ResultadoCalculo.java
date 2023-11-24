/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IngreSistema;

/**
 *
 * @author angel
 */
public class ResultadoCalculo {
    private String tipoCalculo;
    private String valoresUtilizados;
    private double resultado;

    public ResultadoCalculo(String tipoCalculo, String valoresUtilizados, double resultado) {
        this.tipoCalculo = tipoCalculo;
        this.valoresUtilizados = valoresUtilizados;
        this.resultado = resultado;
    }

    public String getTipoCalculo() {
        return tipoCalculo;
    }

    public String getValoresUtilizados() {
        return valoresUtilizados;
    }

    public double getResultado() {
        return resultado;
    }
}
