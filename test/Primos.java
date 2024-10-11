
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner(System.in);
        int contador=0;
        int num;
        
        
        do{
            System.out.print("Dime un numero:");
            num=Integer.parseInt(teclado.nextLine());
            
            contador=0; //IMPORTANTE resetear el contador
            
            if (num!=0){
                for (int i = 1; i <= num; i++) {  //i son los posibles divisores
                    if (num%i==0){
                        //System.out.println("El numero "+i+" es divisor de "+num);
                        contador++;
                    }
                }
                if (contador==2) 
                    System.out.println("El numero "+num+" es PRIMO");
                else
                    System.out.println("El numero "+num+" NO es PRIMO");
            }    
        }while(num>0);
        
        
    }
    
}
