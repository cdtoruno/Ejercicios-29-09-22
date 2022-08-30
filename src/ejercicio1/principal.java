/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author tggtr
 */
public class principal {
    static private String nombrePersona;
    static private String apellidoPersona;
    static private double salarioPersona;
    static private String codePersona;

    public principal(String nombrePersona, String apellidoPersona, double salarioPersona, String codePersona) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.salarioPersona = salarioPersona;
        this.codePersona = codePersona;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su codigo: ");
        codePersona = entrada.nextLine();
        System.out.println("Ingrese su nombre: ");
        nombrePersona = entrada.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellidoPersona = entrada.nextLine();
        System.out.println("Ingrese su salario mensual: ");
        salarioPersona = entrada.nextDouble();
        System.out.println("Su salario mensual es de " +salarioPersona/30);
        
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public double getsalarioPersona() {
        return salarioPersona;
    }

    public void setsalarioPersona(double salario) {
        this.salarioPersona = salarioPersona;
    }

    public String getCodePersona() {
        return codePersona;
    }

    public void setCodePersona(String codePersona) {
        this.codePersona = codePersona;
    }
    
}
