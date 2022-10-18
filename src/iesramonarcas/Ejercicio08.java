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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        boolean hayNegativos=false;
        
        do {
         
            System.out.print("Introduce un numero:");
            numero=Integer.parseInt(entrada.nextLine());
            
            if (numero<0){ 
                hayNegativos=true;  
            }
            
        } while(numero != 0);
             
        //Analizamos el testigo
        if (hayNegativos)
            System.out.println("SI has introducido negativos.");
        else
            System.out.println("NO has introducido negativos.");
            
        
        
        
        
    }
    
}
