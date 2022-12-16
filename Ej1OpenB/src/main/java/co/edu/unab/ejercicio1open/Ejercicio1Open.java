/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package co.edu.unab.ejercicio1open;

/**
 *
 * @author ACER
 */
public class Ejercicio1Open {

    public static void main(String[] args) {
        //Parte N°1
        sumar(2, 5, 8);
        //Parte N°2
      Coche miCoche = new Coche();
        miCoche.suma_Puertas();
        miCoche.suma_Puertas();
        miCoche.suma_Puertas();
        miCoche.suma_Puertas();
        miCoche.suma_Puertas();
        miCoche.suma_Puertas();
        System.out.println(miCoche.N_puertas);
    }

    public static void sumar(int n1, int n2, int n3) {
        System.out.println("El resultado es " + (n1 + n2 + n3));
    }
    
}

