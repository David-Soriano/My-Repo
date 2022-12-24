/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.unab.ejercicio_tema9;

/**
 *
 * @author ACER
 */
public class Ejercicio_tema9 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        cliente.setEdad(21);
        cliente.setNombre("Santiaago");
        cliente.setTelefono("311 545 1234");
        cliente.setCredito(3000000);
        
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());
        
        Trabajador trabajador = new Trabajador();
        
        trabajador.setEdad(34);
        trabajador.setNombre("Diego");
        trabajador.setTelefono("314 528 3333");
        trabajador.setSalario(2000000);
        
        System.out.println("Edad trabajador: " + trabajador.getEdad());
        System.out.println("Nombre trabajador: " + trabajador.getNombre());
        System.out.println("Telefono trabajador: " + trabajador.getTelefono());
        System.out.println("Salario trabajador: " + trabajador.getSalario());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}

class Cliente extends Persona{
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
}

class Trabajador extends Persona{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
