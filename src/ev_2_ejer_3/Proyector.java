/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ev_2_ejer_3;

/**
 *
 * @author Ceduc-Lab306-24
 */
public class Proyector extends Equipo {
    private int horasUso;

    public Proyector(String serie, String modelo, int horasUso) {
        super(serie, modelo);
        this.horasUso = horasUso;
    }

    @Override
    public double calcularCosto() {
        return 60.0 + (1.5 * horasUso);
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Horas de uso: " + horasUso);
    }
}