/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_captura_2;

import java.util.Scanner;
/**
 *.
 * @author bisonte
 */
/**
 *
 * @author bisonte
 */
public class EVA1_5_CAPTURA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DECLARAR VARAIBLES.
        
        String nombre;
        int edad;
        double salario;
        
    Scanner captura = new Scanner(System.in);
        
        System.out.print("Capture nombre: ");
            nombre = captura.nextLine();
        
        System.out.print("Capture edad: ");
            edad = captura.nextInt();
           
        System.out.print("Capture salario: ");
            salario = captura.nextDouble();
     
            
    System.out.println("<<<<<<<<<<<<DATOS CAPTURADOS>>>>>>>>>>>>>>");

        
        System.out.print("Nombre: ");
            System.out.println(nombre);

        System.out.print("Edad: ");
            System.out.println(edad);            

        System.out.print("Salario: ");
            System.out.println(salario);             

    }
    
}
