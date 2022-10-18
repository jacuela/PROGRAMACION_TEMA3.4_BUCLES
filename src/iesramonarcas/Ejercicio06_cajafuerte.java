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
    
        int numeroIntroducido;
        int intentos = 3;
        int password=8888;
        
        boolean acertado = false;
        
        
        
        System.out.println("CAJA FUERTE. 3 INTENTOS");
        System.out.println("***********************");

        System.out.println("== opcion1: usando un break ==");
        do {
         
            System.out.print("Introduce la clave ("+intentos+"):");
            numeroIntroducido=Integer.parseInt(entrada.nextLine());
            
            if (numeroIntroducido == password){
                System.out.println("CLAVE ENCONTRADA!!");
                break;
            }
            
            intentos--;
            
        } while(intentos > 0);
        
        
        
        
//        System.out.println("== opcion2: usando booleano ==");
//        do {
//         
//            System.out.print("Introduce la clave ("+intentos+"):");
//            numeroIntroducido=Integer.parseInt(entrada.nextLine());
//            
//            if (numeroIntroducido == password){
//                System.out.println("CLAVE ENCONTRADA!!");
//                acertado=true;  //opción usando un testigo booleano
//                    
//            }
//            
//            intentos--;
//            
//        } while(intentos > 0 && acertado==false);
        
        //Si usamos un testigo, podemos consultarlo despues del bucle
//        if (acertado)
//            System.out.println("CLAVE ENCONTRADA!!");
//        else
//            System.out.println("LO SIENTO. NO HAS PODIDO ENTRAR");
//                
  
    
    }
    
}
