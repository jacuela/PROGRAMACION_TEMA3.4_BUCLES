/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class PruebaAnidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int lado=4;
        //Dibujamos la parte de arriba del cuadrado
        for(int cont=0;lado>cont;cont++){
            System.out.print("*");
        }
        System.out.println("");
 
        //Usamos un bucle anidado para dibujar los asteriscos del medio
        for(int cont=1;(lado-2)>=cont;cont++){
            System.out.print("*");
            //Este bucle dibuja los espacio entre el primer y ultimo asterisco
            for (int i=0;(lado-2)>i;i++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
 
        //Dibujamos la parte de abajo del cuadrado
        for(int cont=0;lado>cont;cont++){
            System.out.print("*");
        }
        
        System.out.println("");
        
    }
    
}
