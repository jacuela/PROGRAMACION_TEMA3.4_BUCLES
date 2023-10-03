/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejercicio00_Iniciacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
        
        
//        System.out.println("**** for ****");
//        for (int i=1;i<=10;i++){
//            System.out.println("i vale:"+i);
//            
//        }
        
//        System.out.print("Dime repeticiones:");
//        int pasos=Integer.parseInt(teclado.nextLine());
//        for (int i=1;i<=pasos;i++){
//            System.out.println("Hola Pepe");
//            
//        }
//        System.out.println("---------------");
//        for (int i=0;i<pasos;i++){
//            System.out.println("Hola Pepe");
//            
//        }
        
      
     
        
//        System.out.println("\n\n**** while ****");
//        int i=10;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
//        
        
//        System.out.println("\n\n**** do while ****");
//        i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<11);
//        
        
         
//        System.out.println("\n\n**** Introducir numeros hasta negativ ****");
//        
//        int num;
        
//        System.out.println("--- Usando un while ---");
//        System.out.print("Numero positivo para continuar: ");
//        num=Integer.parseInt(teclado.nextLine());

//        while (num>=0){
//            System.out.print("Numero positivo para continuar: ");
//            num=Integer.parseInt(teclado.nextLine());
//        }
        
        
//        System.out.println("--- Usando un do..while ---");
//        do{
//            System.out.print("Numero positivo para continuar: ");
//            num=Integer.parseInt(teclado.nextLine());
//        } while (num>=0);
        
        
        

//          //Introducir numeros por teclado hasta impar
//          System.out.println("**** Introducir hasta impar ****");
//          int num;
//          
//          do{
//            System.out.print("Numero par para continuar: ");
//            num=Integer.parseInt(teclado.nextLine());
//            
//            //Compruebo numero feo
//            if (num==8){
//                System.out.println("Has introducido el num feo");
//                break;
//            }
//            
//          }while (num%2==0);
//     


//          //int num;
//          
//          System.out.print("Numero par para continuar: ");
//          num=Integer.parseInt(teclado.nextLine());
//          
//          while(num%2==0){
//            System.out.print("Numero par para continuar: ");
//            num=Integer.parseInt(teclado.nextLine());
//          }
         

          //Leer pares parando con un break
//          System.out.println("**** Introducir hasta impar ****");
//          int num;
//          
//          do{
//            System.out.print("Numero par para continuar: ");
//            num=Integer.parseInt(teclado.nextLine());
//            if (num%2!=0){
//                break;
//            }
//          }while (true);
           


//          //Usar un for con break. Leer 10 numeros y parar si pongo un impar
//          int num;
//          
//          for (int i=0;i<10;i++){
//                //System.out.print("Paso "+i+"-->");
//                System.out.print("PAR para continuar: ");
//                num=Integer.parseInt(teclado.nextLine());
//                if (num%2!=0){
//                    break;
//                }
//          }
//          
//        //Imprimir letras de la A a la Z  
//        for (int i=65;i<=90;i++){
//            System.out.print("Letra:"+(char)i);
//            System.out.println("---"+(char)(i+32));
//           
//        }
//   
            

            //COntadores y acumuladores  
            int num;
            int contador=0;
            int acumulador=0;
  
            System.out.println("- Introduce numeros. Cero para fin-");
            do{
                System.out.print("Dime un numero:");
                num=Integer.parseInt(teclado.nextLine());
                
                //Cuento los pasos
                if (num!=0){
                     acumulador=acumulador+num; 
                     contador++;
                }
                               
            }while(num!=0);
            
            System.out.println("Has introducido "+contador+" numeros");
            System.out.println("La suma de ellos es "+acumulador);
            
            
            
            
            
            
            
            
            
            


    
        
        
    }
    
}
