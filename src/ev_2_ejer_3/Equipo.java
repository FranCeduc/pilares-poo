/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ev_2_ejer_3;

/**
 *
 * @author Ceduc-Lab306-24
 */

public class Equipo {
    
    //Serie y modelo son private porque solo puede acceder a estos atributos la
    //clase Equipo y se pueden acceder mediante los getters getSerie() y
    //getModelo(). Estado es protected porque permite que la clase Equipo y sus
    //subclases hijas (Impresora y Proyector) accedan directamente al atributo
    //Estado y pueden utilizar o modificar sus datos.
    private String serie;
    private String modelo;
    protected String estado;

    public Equipo(String serie, String modelo) {
        this.serie = serie;
        this.modelo = modelo;
        this.estado = "inactivo";
    }

    public String getSerie() {
        return serie;
    }

    public String getModelo() {
        return modelo;
    }

    public void activar() {
        estado = "activo";
    }

    public double calcularCosto() {
        return 15.0;
    }

    public void mostrarFicha() {
        System.out.println("Serie: " + serie);
        System.out.println("Modelo: " + modelo);
        System.out.println("Estado: " + estado);
    }
}