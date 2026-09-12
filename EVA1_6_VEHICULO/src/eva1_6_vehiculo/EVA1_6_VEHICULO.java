/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_6_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner captura = new Scanner(System.in);
           
        String marca;
        String modelo;
        int year;
        String color;
        double km;
        double precio;       
        
    
    System.out.println("<<<<<<<<<<<<CAPTURE LOS DATOS>>>>>>>>>>>>>>");

        System.out.print("Capture marca: ");
            marca = captura.nextLine();

        System.out.print("Capture modelo: ");
            modelo = captura.nextLine();        
           
        System.out.print("Capture año: ");
            year = captura.nextInt(); 
            
            captura.nextLine();
            
        System.out.print("Capture color: ");
            color = captura.nextLine(); 
            
        System.out.print("Capture kilometraje: ");
            km = captura.nextDouble();         
            
        System.out.print("Capture precio: ");
            precio = captura.nextDouble();         
            
            
    System.out.println("<<<<<<<<<<<DATOS CAPTURADOS>>>>>>>>>>>>>>");
    
    
        System.out.print("Marca: ");
            System.out.println(marca);

        System.out.print("Modelo: ");
            System.out.println(modelo);   
            
        System.out.print("Año: ");
            System.out.println(year);          
            
        System.out.print("Color: ");
            System.out.println(color);             

        System.out.print("Kilometraje: ");
            System.out.print(km); 
            System.out.println(" Km");

        System.out.print("Precio: $ ");
            System.out.println(precio);              
    }
    
}
