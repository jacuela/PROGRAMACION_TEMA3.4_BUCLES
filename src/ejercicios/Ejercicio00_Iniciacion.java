/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

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
        
        
        
        //===== EJERCICIO DE INTRODUCCION A LOS BUCLES
//        String password;    //la contraseña será flori
//        boolean hasAcertado=false;
//          
        
//        //---------- intento1
//        if (hasAcertado==false){
//           System.out.print("Intento 1: Dime la contraseña:");
//           password = teclado.nextLine();
//        
//            if (password.equals("flori")){
//                System.out.println("Has acertado");
//                hasAcertado=true;
//            }
//            else{
//                System.out.println("Has fallado");     
//            } 
//            
//        }
//        
//        
//        //---------- intent2
//        if (hasAcertado==false){
//           System.out.print("Intento 2: Dime la contraseña:");
//           password = teclado.nextLine();
//        
//            if (password.equals("flori")){
//                System.out.println("Has acertado");
//                hasAcertado=true;
//
//            }
//            else{
//                System.out.println("Has fallado");     
//            } 
//            
//        }
//       
//        //---------- intent3
//        if (hasAcertado==false){
//           System.out.print("Intento 3: Dime la contraseña:");
//           password = teclado.nextLine();
//        
//            if (password.equals("flori")){
//                System.out.println("Has acertado");
//                hasAcertado=true;
//            }
//            else{
//                System.out.println("Has fallado");     
//            } 
//            
//        }
//        
//        
//        int intentos=1;
//        
//      
//        while (hasAcertado==false && intentos<=3){
//            System.out.println("\n\nIntento numero: "+intentos);
//            System.out.print("Dime la contraseña:");
//            password = teclado.nextLine();
//        
//            if (password.equals("flori")){
//                System.out.println("Has acertado");
//                hasAcertado=true;
//            }
//            else{
//                System.out.println("Has fallado");     
//            } 
//            
//            intentos=intentos+1;
//            
//        }
        
        
          //==== INICIACION A LOS BUCLES =====================  
 
//       
          
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
//        int i=1;
//        while(i<=10){
//            System.out.println("Hola Pepe");
//            i++;
//        }
//        
//        
//        System.out.println("\n\n**** do while ****");
//        i=1;
//        do{
//            System.out.println("Hola Pepe");
//            i++;
//        }while(i<=10);
//        
        

//
//        System.out.println("\n\n**** Introducir numeros hasta negativ ****");
//        
//        int num=0;
//        
//        System.out.println("--- Usando un while ---");
//        System.out.print("Numero positivo para continuar: ");
//        num=Integer.parseInt(teclado.nextLine());
//
//        while (num>=0){
//            System.out.print("Numero positivo para continuar: ");
//            num=Integer.parseInt(teclado.nextLine());
//        }
//        
//        
//        System.out.println("--- Usando un do..while ---");
//        do{
//            System.out.print("Numero positivo para continuar: ");
//            num=Integer.parseInt(teclado.nextLine());
//        } while (num>=0);
        
        
        

          //Introducir numeros por teclado hasta impar
//          System.out.println("**** Introducir hasta impar ****");
//          int num;
//          
//          do{
//            System.out.print("Numero par para continuar: ");
//            num=Integer.parseInt(teclado.nextLine());
//            
//            
//            if (num==84){
//                System.out.println("OooH, numerp feo!! bye");
//                break;
//            }
//            
//            
//          }while (num%2==0);
    


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
//           


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
////   
            

            //COntadores y acumuladores  
//            int num;
//            int contador=0;
//            int acumulador=0;
//  
//            System.out.println("- Introduce numeros. Cero para fin-");
//            do{
//                System.out.print("Dime un numero:");
//                num=Integer.parseInt(teclado.nextLine());
//                
//                if (num!=0){
//                    acumulador=acumulador+num; 
//                    contador++;
//                }
//                System.out.println("                         Contador:"+contador);
//                System.out.println("                         Acumulador:"+acumulador);
//                System.out.println("----------------------------");
//                
//            }while(num!=0);
//            
//            System.out.println("Has introducido "+contador+" numeros");
//            System.out.println("La suma de ellos es "+acumulador);
//            
            //Recorrer una cadena
            System.out.print("Dime una palabra:");
            String palabra=teclado.nextLine();
            
            System.out.println("Palabra: "+palabra);
            
            for (int i = 0; i < palabra.length(); i++) {
                
                System.out.println("Letra:"+palabra.charAt(i));
            }
    
            
        }

            
            
            
            
            
            
            
            


    
        
        
    }
    
}
