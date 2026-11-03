/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ev_2_ejer_3;

/**
 *
 * @author Ceduc-Lab306-24
 */
public class Ev_2_ejer_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crea un arreglo de Equipo con cuatro objetos: 
        //dos impresoras y dos proyectores con datos distintos
        
        //Polimorfismo desde linea 21 hasta linea 26
        Equipo[] equipos = new Equipo[4];

        equipos[0] = new Impresora("IMP1", "HP", 100);
        equipos[1] = new Impresora("IMP1", "Epson", 200);
        equipos[2] = new Proyector("PRO1", "BenQ", 5);
        equipos[3] = new Proyector("PRO2", "Sony", 10);
        
        //Activa dos de ellos
        equipos[0].activar();
        equipos[2].activar();
        
        //Recorre el arreglo con un solo ciclo llamando a mostrarFicha() y 
        //a calcularCosto() de cada objeto, sin preguntar de qué tipo es, 
        //y acumula el costo total para mostrarlo al final
        
        //Polimorfismo desde linea 36 hasta linea 42
        double total = 0.0;
        
        for (int i = 0; i < 4; i++) {
            equipos[i].mostrarFicha();

        double costo = equipos[i].calcularCosto();
        total += costo;
        
        System.out.println("Costo total: $" + total);
        
    }
}
}
