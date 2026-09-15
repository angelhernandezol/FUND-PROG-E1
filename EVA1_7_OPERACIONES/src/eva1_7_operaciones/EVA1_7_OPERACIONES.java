/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_operaciones;

import java.util.Scanner;


/**
 *
 * @author bisonte
 */



public class EVA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EL TIPO DE DE DATO DETERMINA LAS OPERACIONES
        //ENTEROS, REALES, CADENAS, LOGICOS, ETC
        //EXPRESIÓN: 
            //VALORES
            //VARIABLES
            //OPERADORES
            //FUNCIONES
            //SE EVALUAN PARA OBTENER UN RESULTADO
            //OPERACIONES CON NÚMEROS
            
            //ARITMETICAS:
            int suma, val1, val2, val3; //Declaración de variables del mismo tipo
            
            //ASIGNACIÓN: PONER UN VALOR EN UNA VARAIBLE
            // Operador --> Simobolo que trabaja SOBRe identificadores.
            // = --> Asignación --> Pone un valor
            // == --> Comparación 
            
            val1 = 100; //Asignación de valor de 100 a la varaible val1
            val2 = 50;
            suma = val1 + val2; //Expresión, asignar a la varaible suma la operación entre val1 y val2
            // + --> esta entre dos enteros, se interpreta como que se debde sumar
            
            System.out.print("Val1 = ");
            System.out.println(val1);
            
            System.out.print("Val2 = ");
            System.out.println(val2);
            
            System.out.print("  Suma = ");
            System.out.println(suma); 
            
            //OPERACIONES RESPETAN REGLAS MATEMÁTICAS
            
            
            //MULTIPLICACIÓN *
            
            int multi; 
            multi = val1 * val2; 
            
            System.out.print("  Multiplicacion = ");
            System.out.println(multi); 
            
            
            //DIVISIÓN /
           
            int div;
            div = val1 / val2;
            
            System.out.print("  Division = ");
            System.out.println(div); 
            
            val1 = 10;
            val2 = 3;
            
            div = val1 / val2;
            
            System.out.print("Val1 = ");
            System.out.println(val1);
            
            System.out.print("Val2 = ");
            System.out.println(val2);
            
            System.out.print("  Division = ");
            System.out.println(div);
            
            double resu;
            resu = val1 / val2; 
            
            System.out.print("  Resu= ");
            System.out.println(resu);
            
            double val2copia;
            val2copia = 3;
            
            resu = val1 / val2copia;
            
            System.out.print("  Resu= ");
            System.out.println(resu);
    }
    
}
