/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IngreSistema;

/**
 *
 * @author Josué
 */
public class Usuarios {
     private String nombre;
    private String nombreUsuario;
    private String contrasena;
    private String cedula;
    private String calculoDisponible;

    public Usuarios(String nombre, String nombreUsuario, String contrasena, String cedula, String calculoDisponible) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.cedula = cedula;
        this.calculoDisponible = calculoDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCalculoDisponible() {
        return calculoDisponible;
    }
}
