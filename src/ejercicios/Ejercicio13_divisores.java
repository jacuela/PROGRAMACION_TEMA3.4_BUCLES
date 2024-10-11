/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejercicio13_divisores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int num;   //***EXPLICAR PORQUE NO PUEDO DECLARARLO DENTRO DEL DO..WHILE
        int contadorDivisores=0;
        
        
        
        //http://nosolomates.es/ayuda/ayuda/divisores.htm
        
        System.out.println("   CALCULO DE DIVISORES");
        System.out.println("===========================");
        do{
        
            System.out.print("Dime un numero (0 para salir):");
            num=Integer.parseInt(teclado.nextLine());
            contadorDivisores=0;

            for (int i = 1; i <= num; i++) {  //i son los posibles divisores
                if (num%i==0){
                    System.out.println("  El numero "+i+" es divisor de "+num);
                    contadorDivisores++;
                }
            }
            System.out.println("");
            //System.out.println("DEPURA:"+contadorDivisores);
            if (contadorDivisores==2){
                System.out.println("El numero "+num+" SI es PRIMO");
            }
            else if (num!=0){ //para evitar tratar el CERO
                System.out.println("El numero "+num+" NO es PRIMO");
            }
            
            
     
        }while (num!=0);    
        
        //Sería muy fácil sacar si el numero num es primo, no?
        
        
        
        
        
        
        
        
    }
    
}
