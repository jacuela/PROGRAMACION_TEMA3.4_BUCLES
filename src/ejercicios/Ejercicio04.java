/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author jacuela
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        
        System.out.println("Multiplos de 5 usando un for");
        for(i = 0; i <= 50;i++) { 
            if (i%5==0){
                System.out.println(i);
            }
            
        }
        
//        
//        System.out.println("Multiplos de 5 usando un while");
//        i = 0;
//        while(i <= 50) { 
//            if (i%5==0){
//                System.out.println(i);
//            }
//             
//            i=++;
//        }
//        
//        System.out.println("Multiplos de 5 usando un do-while");
//        i = 0;
//        do { 
//            if (i%5==0){
//                System.out.println(i);
//            }
//            i++;
//        } while(i <= 50);

        System.out.println("----------------------------------------");    

        //Numeros del 100 al 50
        System.out.println("Numeros del 100 al 50 pares con un while");
        for (int j = 100; j >= 50; j--) {
            
            if (j%2 == 0) {
                System.out.println(j);
            }
        }
        
        i=100;
        while(i>=50){
            if (i%2==0) System.out.println(i);
            i--;
        }
       
        
        
    }
    
}
