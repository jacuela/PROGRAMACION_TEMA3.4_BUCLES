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
public class Ejercicio06_cajafuerte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
    
        String numeroIntroducido;
        int intentos = 3;
        String password="0112";   //Lo trato como cadena para permitir password que empiecen por 0
                             //int dato=0112    es numero octal   
        
            
  
        
//        System.out.println("CAJA FUERTE. 3 INTENTOS");
//        System.out.println("***********************");
//
//        System.out.println("== opcion1: usando un break ==");
//        do {
//            System.out.print("Introduce la clave ("+intentos+"):");
//            numeroIntroducido=entrada.nextLine();
//            
//            
//            if (numeroIntroducido.equals(password)){
//                System.out.println("\033[32mCLAVE ENCONTRADA!!\033[30m");
//                break;
//            }
//            intentos--;
//            if (intentos==0){
//                System.out.println("\033[31mLO SIENTO. CAJA BLOQUEADA\033[30m");
//            }
//        } while(intentos > 0);
        
        
        
              
   
        
        System.out.println("== opcion2: usando booleano ==");

        boolean acertado = false;

        do {
            System.out.print("Introduce la clave ("+intentos+"):");
            numeroIntroducido=entrada.nextLine();
            
            if (numeroIntroducido.equals(password)){
                //System.out.println("\033[32mCLAVE ENCONTRADA!!\033[30m");
                acertado=true;  //opción usando un testigo booleano
            }
            intentos--;
        } while(intentos > 0 && acertado==false);
            // (intentos > 0 && !acertado)
        
        
        //Si usamos un testigo, podemos consultarlo despues del bucle
        if (acertado)
            System.out.println("\033[32mCLAVE ENCONTRADA!!\033[30m");
        else
            System.out.println("\033[31mLO SIENTO. CAJA BLOQUEADA\033[30m");
                
  
    
    }
    
}
