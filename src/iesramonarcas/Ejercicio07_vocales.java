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
public class Ejercicio07_vocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        
        String entrada;
        char caracter;
        
        do {
            //Leemos un caracter por teclado    
            System.out.print("Introduce un caracter:");
            entrada=scn.nextLine();
            entrada=entrada.toLowerCase(); //paso todo a minuscula
            caracter=entrada.charAt(0);
            
            
            //Tratamiento del caracter vocal
            if (caracter == 'a' || 
                caracter == 'e' || caracter == 'i' || caracter == 'o' ||
                caracter == 'u' ){
                System.out.println("............vocal");
            }
            //Tratamiento del caracter espacio en blanco
            else if (caracter == ' '){
                System.out.println("FIN");
            }
            //Tratamiento del resto
            else    
                System.out.println("............no vocal");
            
        } while(caracter != ' ');
                
        
        
        
    }
    
}
