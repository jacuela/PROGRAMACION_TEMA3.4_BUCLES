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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        int num;
        
        System.out.print("Dime un numero:");
        num=Integer.parseInt(entrada.nextLine());
        
        System.out.println("\n\nTabla de multiplicar del número "+num);
        
        System.out.println("USANDO FOR");
        System.out.println("==========");
        for (int i=1;i<=10;i++){
        
            //System.out.println(num+"*"+i+"="+(num*i));
            System.out.printf("%d * %d = %d\n",num,i,(num*i));
            
        }
        
        System.out.println("USANDO while");
        System.out.println("==========");
        int j=1;
        while (j<=10){
                System.out.println(num+"*"+j+"="+(num*j));
                j++;
        }
       
        //En este punto, j vale 11
        
        System.out.println("USANDO do..while");
        System.out.println("==========");
        
        j=1;
        do{
             System.out.println(num+"*"+j+"="+(num*j));
             j++;
        }while(j<=10);
        
        
        
        
    }
    
}
