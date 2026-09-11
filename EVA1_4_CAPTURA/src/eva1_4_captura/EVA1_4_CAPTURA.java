/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_captura;

import java.util.Scanner;


/**
 *
 * @author bisonte
 */
public class EVA1_4_CAPTURA {

    
    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        //SI SE USAN VARAIBLES, SE TIENEN QUE DECLARAR ANTES DE USARSE
        //DECLARAR --> CREAR LA VARIABLE PARA SU USO EN EL PROGRMA
        //TIPO_DATO NOMBRE_IDENTIFICADOR;
        //USAMOS NOMBRES SIGNIFICATIVOS --> DEBE ENTENDERSE PARA QUE SE USA
        
        String nombre;
           Scanner captura = new Scanner(System.in);  //VARIBLE --> TIPO SCANNER
        // = ES UNA ASIGNACIÓN 
       // CAPTURAR DEL TECLADO Y PONERLO EN LA VARIABLE NOMBRE (ASIGNACIÓN)
        
        System.out.println("Capture el nombre:");
        //ENTRADA DE DATOS EN EL TECLADO(JAVA)
      
       nombre = captura.nextLine();
       
        System.out.print("El valor capturado es: ");
        System.out.println(nombre);

        
        
        
        
    }
    
}

