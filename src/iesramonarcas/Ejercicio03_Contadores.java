/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

import java.util.Scanner;

/**
 *
 * @author jacuela
 */
public class Ejercicio03_Contadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        
        
        //*********  USANDO UN DO....WHILE  ***********
        
//        System.out.println("[do..while]Introduce un número y pulsa INTRO. 0 para terminar\n");
//
//        int numeroIntroducido; 
//        int cuentaNumeros = 0;    //mi contador
//        int suma = 0;             //mi acumulador
//
//        do{
//            
//            System.out.print("Dime el numero:");
//            numeroIntroducido = Integer.parseInt(entrada.nextLine()); 
//            
//            cuentaNumeros++; // Incrementamos el contador
//            suma = suma + numeroIntroducido; //Acumulamos suma parcial
//              
//        } while (numeroIntroducido != 0 ); 
//        
//        System.out.println("\nHas introducido " + (cuentaNumeros-1) + " números.");
//        System.out.println("La suma total de ellos es " + suma);
        
        


        //*********  USANDO UN WHILE  ***********
        
        System.out.println("[while] Introduce un número y pulsa INTRO. 0 para terminar\n");


        //Inicializamos variables
        int cuentaNumeros = 0;    //mi contador
        int suma = 0; 
        int numeroIntroducido; 
        
        //IMPORTANTE: Tratamiento especial del primer elemento
        System.out.print("Dime el numero:");
        numeroIntroducido = Integer.parseInt(entrada.nextLine()); 
        suma = suma + numeroIntroducido;
        cuentaNumeros++;
     
        while(numeroIntroducido != 0 ){
            System.out.print("Dime el numero:");
            numeroIntroducido = Integer.parseInt(entrada.nextLine()); 
            cuentaNumeros++; // Incrementamos el contador
            suma = suma + numeroIntroducido; //Acumulamos suma parcial
        }
        System.out.println("\nHas introducido " + (cuentaNumeros-1) + " números.");
        System.out.println("La suma total de ellos es " + suma);
        
        
        
        
    }
    
}
