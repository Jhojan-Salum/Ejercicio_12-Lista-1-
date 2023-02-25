/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12;

/**
 *
 * @author Jhojan
 */
import java.util.Scanner;

public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salario,retencion,salarioB,retencionB,horas,vhora;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese Horas trabajadas: ");
        horas = Entrada.nextDouble();
        System.out.println("Ingrese el valor de la hora: ");
        vhora = Entrada.nextDouble();        
        retencion = 0.125;
        salario = vhora*horas;
        salarioB = salario*(1-retencion);
        retencionB = salario*retencion;
        
        System.out.println("El salario Bruto es: " + salarioB);
        System.out.println("La retencion Bruta es: " + retencionB);
        
    }
    
}
