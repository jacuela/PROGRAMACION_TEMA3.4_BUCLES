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
public class Ejercicio02_Acumuladores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in); 
       
         
        System.out.println("Dime un numero N:");
        int num=Integer.parseInt(entrada.nextLine());
         
        int suma=0;
        for (int i = 1; i <= num; i++) {
            suma=suma+i;
            //System.out.println("valor de suma"+suma);
        }
        System.out.println("La suma de los "+num+" primeros num. es:"+suma);
        
                
        int factorial=1;
        for (int i = 1; i <= num; i++) {
            factorial=factorial*i;
        }
        System.out.println("El factorial de "+num+" es:"+factorial);
        
        
        
         
        
    }
    
}
