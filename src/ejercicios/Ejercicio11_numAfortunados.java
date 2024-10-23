package ejercicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author jacuela
 */
public class Ejercicio11_numAfortunados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("**************************");
        System.out.println("   NUMEROS AFORTUNADOS");
        System.out.println("**************************");
        
        
        String numero;
        char caracter;
        int numerosAfortunados=0;
        int numerosNoAfortunados=0;
        
        
        //Para poder hacer un WHILE en lugar de un DO..WHILE, hago una lectura
        //inicial
        System.out.print("Introduzca un número [INTRO para fin]: ");
        numero=teclado.nextLine();
          
        
        while (!numero.equals("")) {
           
            numerosAfortunados=0;  //reseteo contadores
            numerosNoAfortunados=0; //reseteo contadores
            
            for (int i = 0; i < numero.length(); i++) {

                caracter=numero.charAt(i);

                if (caracter == '2' || caracter == '5' || caracter =='8' ){
                   numerosAfortunados++;
                } 
                else{
                   numerosNoAfortunados++;

                }
            } //termino el bucle



            if (numerosAfortunados > numerosNoAfortunados){
                System.out.println("  El numero "+numero+" es AFORTUNADO");
            }
            else{
                System.out.println("  El numero "+numero+" es NO AFORTUNADO");
            }
            
        
            System.out.print("Introduzca un número [INTRO para fin]: ");
            numero=teclado.nextLine();
          
            
        }
        
        
        
        //*********************************
        //Otra forma de resolverlo usando como
        //entrada un numero, en este caso un long
        
        
//        System.out.print("Introduzca un número: ");
//        
//        long numeroIntroducido = Long.parseLong(entrada.nextLine()); 
//        long copia = numeroIntroducido;
//        int afortunados = 0; 
//        int noAfortunados = 0;
//
//        
//        while (numeroIntroducido > 0) {
//            int digito = (int)(numeroIntroducido % 10);
//            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) { 
//                afortunados++;
//            }else { 
//                noAfortunados++;
//
//            }
//        
//            numeroIntroducido /= 10;
//        }
//        
//        if (afortunados > noAfortunados) {
//             System.out.println("El " + copia + " es un número afortunado.");
//        } else {
//                System.out.println("El " + copia + " no es un número afortunado.");
//        
//        }
//        
        
    }
    
}
