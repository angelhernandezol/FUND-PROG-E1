/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_11_TEMPERATURA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         double temp, cel, kelv;
       
         
        Scanner capture = new Scanner(System.in);

        System.out.println("    Ingrese la temperatura en grados Fahrenheit: ");
        
        temp = capture.nextDouble();
        
        cel = (temp - 32) / 1.8;      //Importan los parentesis
        kelv = (temp - 32) * (5/9.0) + 273.15;  // 5/9 da CERO, 5/9.0 DA 0.5 --> Tipos de datos
        
           System.out.println(temp + " Grados Fahrenheit = " + cel + " Celsius");
           System.out.println(temp + " Grados Fahrenheit = " + kelv + " Kelvin");

        
    }
    
      
}
