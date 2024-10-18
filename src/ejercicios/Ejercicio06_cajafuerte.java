/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

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
        int intentos = 0;
        String password="1234";   //Lo trato como cadena para permitir password que empiecen por 0
                             //int dato=0112    es numero octal   
        
            
  
        
        System.out.println("CAJA FUERTE. 3 INTENTOS");
        System.out.println("**********1234**********");

        System.out.println("== opcion1: condicion en while y sin booleano ==");
        
        do {
            System.out.print("Introduce la clave:");
            numeroIntroducido=entrada.nextLine();
            intentos++;
            
            //Mensaje si acierto o fallo
            if (numeroIntroducido.equals(password)){
                System.out.println("\033[32mCLAVE ENCONTRADA!!\033[30m");
              
            }
            else if (intentos==3){
                System.out.println("\033[31mLO SIENTO. CAJA BLOQUEADA\033[30m");
           
            }
        }while (!numeroIntroducido.equals(password)
                && intentos<3);
        
        
        
   
        
//        System.out.println("== opcion2: usando booleano y sin break ==");
//
//        boolean acertado = false;
//
//        do {
//            System.out.print("Introduce la clave ("+intentos+"):");
//            numeroIntroducido=entrada.nextLine();
//            
//            if (numeroIntroducido.equals(password)){
//                //System.out.println("\033[32mCLAVE ENCONTRADA!!\033[30m");
//                acertado=true;  //opción usando un testigo booleano
//            }
//            intentos--;
//        } while(intentos > 0 && acertado==false);
//            // (intentos > 0 && !acertado)
//        
//        
//        //Si usamos un testigo, podemos consultarlo despues del bucle
//        if (acertado)
//            System.out.println("\033[32mCLAVE ENCONTRADA!!\033[30m");
//        else
//            System.out.println("\033[31mLO SIENTO. CAJA BLOQUEADA\033[30m");
//                
  


        System.out.println("== opcion3: con break y for ==");

        for (int i = 1; i <=3 ; i++) {
            System.out.print("Introduce la clave:");
            numeroIntroducido=entrada.nextLine();
            
            //Mensaje si acierto y salimos con break
            if (numeroIntroducido.equals(password)){
                System.out.println("\033[32mCLAVE ENCONTRADA!!\033[30m");
                break;
            }
            
            else if (i==3){
                System.out.println("\033[31mLO SIENTO. CAJA BLOQUEADA\033[30m");
           
            }
            
        }

    
    }
    
}
