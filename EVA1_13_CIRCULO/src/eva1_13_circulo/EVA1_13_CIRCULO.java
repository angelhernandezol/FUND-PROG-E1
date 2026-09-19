/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_circulo;

import java.util.Scanner;


/**
 *
 * @author bisonte
 */
public class EVA1_13_CIRCULO {

    static final double PI = 3.1416; //VARIABLE --> static final --> CONSTANTE
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double rad, peri, area, volu;
    Scanner capture = new Scanner(System.in);

    
    System.out.println("Ingrese el radio del circulo: ");
    rad = capture.nextDouble();
    
    peri = 2 * Math.PI * rad;
    area = Math.PI * (Math.pow(rad, 2)); //LIBREIA de Math para funciones matematicas - realizar potenciación 
    volu = (4.0/3.0) * Math.PI * (rad * rad * rad);
    
    
    System.out.println("El volumen, area y perimietro de un circulo con radio " + rad + " es:");
    
    System.out.println("    Perimetro = " + peri + " unidades");
    System.out.println("    Area = " + area + " unidades^2");
    System.out.println("    Volumen = " + volu + " unidades^3");

    
        
        
        
        
    }
    
}
