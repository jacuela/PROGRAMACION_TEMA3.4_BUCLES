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
public class Ejercicio09_BuclesAnidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //****************************
        // BUCLES ANIDADOS
        //****************************
        
        int N;
        double factorial;
        Scanner sc = new Scanner(System.in);
       
//        System.out.print("Introduce un número mayor que cero: ");
//        N = sc.nextInt();
//       
//        
//        //**************  TABLA DE MULTIPLICAR
//        for(int i = 1; i <= N ; i++){ //para cada número desde 1 hasta N
//            
//            //se calcula su tabla de multiplicar del num. i
//            System.out.println("\nTabla del "+i);
//            System.out.println("------------");
//            for(int j = 1; j <= 10; j++){
//                 System.out.println(i+"*"+j+"="+(i*j));
//            }
//
//        }
    
          //***************  
          
          for (int min = 0; min <= 2; min++) {
              for (int seg = 0; seg <= 59; seg++) {
                  //Imprimo los minutos y segundos
                  //Si estoy en los primeros 10 segundos,
                  //le añado un 0 a la salida 
                  if (seg>=0 && seg<=9){
                     System.out.println(min+":0"+seg);
                  }else{
                     System.out.println(min+":"+seg);
                  }
             
                  try{
                      Thread.sleep(1*1000); //Dormimos 1000 miliseg
                  }
                  catch (Exception e){
                      System.out.println(e);
                  }
                  
                  //Me salgo en el 2:00
                  if (min==2 && seg==0){
                      break;
                  }            
              }
              
          }
        
        
        
        
//        //************** FACTORIAL  *********************
//        System.out.println("\nFactoriales de los "+N+" primeros num.");
//        System.out.println("--------------------------------------");
//        for(int i = 0; i <= N ; i++){ //para cada número desde 1 hasta N
//           
//            //se calcula su factorial
//            factorial = 1;
//            for(int j = 1; j <= i; j++){
//                factorial = factorial * j;
//            }
//
//            //se muestra el factorial
//            System.out.printf("%2d! = %.0f \n", i, factorial);
//
//        }
    
    
    }
    
}
