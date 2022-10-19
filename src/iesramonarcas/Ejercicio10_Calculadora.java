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
public class Ejercicio10_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner entrada=new Scanner(System.in);
        
        String tecla;
        int opcion;
        Double numA,numB;
        
        do{
        
            System.out.println("");    
            System.out.println("******Calculadora******");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir\n");
            
            do{
                System.out.print("Dime una opcion[1-5]:");
                opcion=Integer.parseInt(entrada.nextLine());
            }while (opcion<1 || opcion>5);

            
            
        
            switch (opcion){
                case 1:
                        System.out.print("Dime el primer numero:");
                        numA=Double.parseDouble(entrada.nextLine());
                        System.out.print("Dime el segundo numero:");
                        numB=Double.parseDouble(entrada.nextLine());
                        System.out.print("La suma es:");
                        System.out.println(numA+numB);
                        break;
                case 2:
                        System.out.print("Dime el primer numero:");
                        numA=Double.parseDouble(entrada.nextLine());
                        System.out.print("Dime el segundo numero:");
                        numB=Double.parseDouble(entrada.nextLine());
                        System.out.print("La resta es:");
                        System.out.println(numA-numB);
                        break;
                case 3:
                        System.out.print("Dime el primer numero:");
                        numA=Double.parseDouble(entrada.nextLine());
                        System.out.print("Dime el segundo numero:");
                        numB=Double.parseDouble(entrada.nextLine());
                        System.out.print("La multiplicación es:");
                        System.out.println(numA*numB);
                        break;
                case 4:
                        System.out.print("Dime el primer numero:");
                        numA=Double.parseDouble(entrada.nextLine());
                        System.out.print("Dime el segundo numero:");
                        numB=Double.parseDouble(entrada.nextLine());
                        System.out.print("La división es:");
                        System.out.println(numA/numB);
                        break;
                case 5:
                        System.out.println("Saliendo...");
                        break;
                
             } //sin switch
          
             if (opcion != 5){
                System.out.println("--Pulse INTRO para continuar--");
                tecla=entrada.nextLine();
             }
            
        }while (opcion!=5);
        
    }//fin main
    
}
