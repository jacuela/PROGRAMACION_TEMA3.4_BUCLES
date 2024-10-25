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
public class Ejercicio12_email {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //--------------------------------------
        // Un email será valido si tiene el carcacer @
        // y si contiene tambien el caracter .
        // Además, la posición de la @ tiene que ser
        // anterior al .
        //--------------------------------------
        
        Scanner teclado=new Scanner(System.in);
        String mail;
        boolean existe_arroba=false;
        boolean existe_punto=false;
        int posicion_punto=-1;
        int posicion_arroba=-1;
        char caracter;
        
        System.out.println("Validacion de emails");
        System.out.println("====================");
        
        do{
            System.out.println("Dime el email:");
            mail=teclado.nextLine();

            //Reiniciar contadores
            existe_arroba=false;
            existe_punto=false;
            posicion_punto=-1;
            posicion_arroba=-1;
            
            
           
            
            for (int i = 0; i < mail.length(); i++) {
                caracter=mail.charAt(i);

                if (caracter=='@'){
                    existe_arroba=true;
                    posicion_arroba=i;

                }
                if (caracter=='.'){
                    existe_punto=true;
                    posicion_punto=i;

                }
            }

            //Analizo booleano
            if (existe_arroba==true && 
                existe_punto==true &&
                posicion_arroba<posicion_punto){   //if (existe_arroba)
                System.out.println("email \033[32mVALIDO\033[30m");
            }
            else{
                System.out.println("email \033[31mINVALIDO\033[30m");
            }
        }while(!mail.equals(""));
        
        
        
        

            
           
     
       
    }
    
}
