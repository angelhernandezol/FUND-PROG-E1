/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_formula_general;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_14_FORMULA_GENERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        double a, b, c, resu1, resu2;
        Scanner capture = new Scanner(System.in);
        
    System.out.println(">>>>>FORUMLA GENERAL>>>>>");
        
        System.out.println("Ingrese valor a: ");
            a = capture.nextDouble();
    
        System.out.println("Ingrese valor b: ");
            b = capture.nextDouble();

        System.out.println("Ingrese valor c: ");
            c = capture.nextDouble();
            
            resu1 = ((-1 * b) + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
            resu2 = ((-1 * b) - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
    
    System.out.println("Los resultados de la ecuacion cuadratica son:");
        System.out.println("    Resultado 1 = " + resu1);
        System.out.println("    Resultado 2 = " + resu2);
            
            
            
    }
    
}
