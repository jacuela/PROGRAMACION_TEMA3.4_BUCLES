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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("========================");
        System.out.println("       Ejercicio 5");
        System.out.println("========================");
        
        
        Scanner teclado = new Scanner(System.in);
        int totalNumeros;
        int num;
        int numerosPositivos=0;
        int numerosNegativos=0;
        int numerosCero=0;
        
        System.out.println("Dime cuantos numeros quieres introducir:");
        totalNumeros=Integer.parseInt(teclado.nextLine());
        
        
        for (int i = 1; i <= totalNumeros; i++) {
            
            System.out.print("Dime un numero:");
            num=Integer.parseInt(teclado.nextLine());
            
            //Ahora analizo si es positivo, si es nega o cero
            if (num>0){
                //es positivo
                numerosPositivos++;
            }
            else if (num<0){
                //es negativo
                numerosNegativos++;
            }
            else {
                //es cero
                numerosCero++;
            }
        
        }
        
       
        System.out.println("Total positivos: "+numerosPositivos);
        System.out.println("Total negativos: "+numerosNegativos);
        System.out.println("Total cero's: "+numerosCero);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        
//        
//        System.out.print("Cuantos números quieres introducir?: ");
//        int totalNumeros=Integer.parseInt(entrada.nextLine());
//        
//        for (int i = 0; i < totalNumeros; i++) {
//            
//            System.out.print("Dime un numero:");
//            numero=Integer.parseInt(entrada.nextLine());
//        
//            if (numero>0){
//                numerosPositivos++;
//            }      
//            else if (numero<0){
//                numerosNegativos++;
//            }
//            else {
//                numerosCero++;
//            } 
//            
//        }
//        
//        
//        
        
        
    }
    
}
