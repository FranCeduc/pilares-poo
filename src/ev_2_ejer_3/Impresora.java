/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ev_2_ejer_3;

/**
 *
 * @author Ceduc-Lab306-24
 */
public class Impresora extends Equipo {
    private int hojas;

    public Impresora(String serie, String modelo, int hojas) {
        super(serie, modelo);
        this.hojas = hojas;
    }

    @Override
    public double calcularCosto() {
        return 20.0 + (0.05 * hojas);
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Hojas impresas: " + hojas);
    }
}