/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_temperatura;


import java.util.Scanner;
/**
 *
 * @author bisonte
 */
public class EVA1_10_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double temp, far, kelv;
       
        Scanner capture = new Scanner(System.in);
        
        //SOLICITAR DATOS AL USARIO
        //HACER CONVERSIONES
        //MOSTRAR RESULTADO AL USAUARIO
        
        System.out.println("    Ingrese la temperatura en grados centigrados: ");
        
            temp = capture.nextDouble();
            
            far = (temp * 1.8) + 32; //Grados Fahrenheit
            kelv = temp + 273.15;
            
           System.out.println(temp + " Grados Celsius = " + far + " Fahrenheit");
           System.out.println(temp + " Grados Celsius = " + kelv + " Kelvin");

          
    }
    
}
