/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temperatura_3;

import java.util.Scanner;


/**
 *
 * @author bisonte
 */
public class EVA1_12_TEMPERATURA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double temp, cel, fare;
         
        Scanner capture = new Scanner(System.in);
        
        System.out.println("    Ingrese la temperatura en grados Kelvin: ");
         temp = capture.nextDouble();
         
         
         cel = (temp -  273.15);
         fare = (temp -  273.15) * 9/5.0 +32;
         
         System.out.println(temp + " Grados Kelvin = " + cel + " Celsius");
         System.out.println(temp + " Grados Kelvin = " + fare + " Fahrenheit");

    }
    
}
