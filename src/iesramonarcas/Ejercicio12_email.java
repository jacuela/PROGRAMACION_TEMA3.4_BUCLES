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
        System.out.println("********************");
        
        
        do {
           
            System.out.print("Introduce email [INTRO para terminar]: ");
            mail=teclado.nextLine();
            
            //Leo caracter a caracter la cadena introducida
            //para analizar el email introducido
            for (int i = 0; i < mail.length(); i++) {
                caracter=mail.charAt(i);

                //Si el caracter es una @, guardo la posición 
                if (caracter=='@'){
                    posicion_arroba=i;
                    existe_arroba=true;
                    
                }

                //Si el caracter es una ., guardo la posición 
                if (caracter=='.'){
                    posicion_punto=i;
                    existe_punto=true;
                }
            }

            if (!mail.equals("")){  //para evitar hacer análisis si he
                                    //pulsado INTRO
                    //Hago el análisis
                    if (existe_arroba ==true && existe_punto == true 
                            && posicion_arroba < posicion_punto){
                        System.out.println(".....CORRECTO");

                    }
                    else{
                        System.out.println("......INCORRECTO");
                    }
            }
            
            //Reseteo banderas y contadores
            existe_arroba=false;
            existe_punto=false;
            posicion_arroba=0;
            posicion_punto=0;
            
            
        } while (!mail.equals(""));       //!mail.isEmpty() 
            
            

            
            
            //Analizo las posiciones de la arraba y el punto
//            if (posicion_arroba > 0 && posicion_punto > 0 
//                    && posicion_arroba<posicion_punto){
//                System.out.println(".....CORRECTO");
//
//            }
//            else{
//                System.out.println("......INCORRECTO");
//            }

//            System.out.println("");
//            System.out.print("Introduce email [INTRO para terminar]: ");
//            mail=teclado.nextLine();
        
 //       }
     
       
    }
    
}
