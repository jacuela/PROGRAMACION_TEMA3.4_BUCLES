package ejercicios;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejercicio00_BuclesAnidadosEjemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        
        
//        // Imprimir i y j de dos bucles for
//        for (int i = 0; i < 2; i++) {
//            System.out.println("-- Paso externo "+i+"----");
//            for (int j = 0; j < 5; j++) {
//                System.out.println(i+" -- "+j);
//            }
//        }
        
        //Imprimir los numeros del 1 al 10. Hacerlo 5 veces
//        System.out.println("");
//        for (int j = 0; j < 5; j++) {
//            
//            //Numeros del 1 al 10
//            for (int i = 1; i <= 10; i++) {
//                System.out.print(i+" ");
//            }
//            System.out.println("");
//        }
        
        
       // Imprimir los primeros 9 numeros binarios
//        int valor;
//        
//        for (int i = 0; i <= 1; i++) {
//            for (int j = 0; j <= 1; j++) {
//                System.out.print(i+" "+j);
//                valor=i*2+j*1;
//                System.out.println("--->"+valor);
//            }
//        }
        

        //Hacer un cuadrado rellenado de 4 x 4
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                
                if (i==1 || i==4){
                    System.out.print(" * ");
                }
                else{
                    if (j==1 || j==4){
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("------con un array de 2 dimen---");
        char [][] dibujo = {{'*','*','*','*'},
                            {'*',' ',' ','*'},
                            {'*',' ',' ','*'},
                            {'*','*','*','*'}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+dibujo[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        //Imprimir un triangulo rectangulo de altura 5
        // @
        // @@
        // @@@
        // @@@@
        // @@@@@
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
//        for (int i = 0; i <= 1; i++) {
//            for (int j = 0; j <= 1; j++) {
//                for (int k = 0; k <= 1; k++) {
//                    System.out.printf("%d %d %d ",i,j,k);
//                    valor=i*4+j*2+k*1;
//                    System.out.println("--->"+valor);
//                }
//            }
//        }
//        

        
        

        
//        
        
        //Imprimir el cubo de 5 numeros aleatorios generados entre 0 y 9
        //En cada linea imprimir:
        //  Cubo de 2 --> 8
       
        
//        int num_alea;
//        int potencia;
//        for (int i = 0; i < 5; i++) {
//            potencia=1;
//            num_alea=(int)(Math.random()*10);
//            System.out.print("Cubo de "+num_alea+"-->");
//            
//            for (int j = 0; j < 3; j++) {
//                potencia=potencia*num_alea;
//            }
//            System.out.println(potencia);
//            //System.out.println("");
//        
//        }



        //Imprimir el cubo de 5 numeros aleatorios generados entre 0 y 9
        //En cada linea imprimir:
        //  Cubo de 2 --> 2 * 2 * 2 = 8
        
        
//        int num_alea;
//        int potencia;
//        for (int i = 0; i < 5; i++) {
//            potencia=1;
//            num_alea=(int)(Math.random()*10);
//            System.out.print("Cubo de "+num_alea+"-->");
//            
//            for (int j = 0; j < 3; j++) {
//                potencia=potencia*num_alea;
//                System.out.print(num_alea+" * ");
//            }
//            System.out.println(" = "+potencia);
//            System.out.println("");
//        
//        }
        
        
       
        //Imprimir un cuadrado de alto y ancho dado usando asteriscos  
//        int alto=5;
//        int ancho=10;
//        System.out.println("Alto:"+alto+"   Ancho:"+ancho);
//        
//        for ( int row = 0 ; row < alto ; row++ )
//           {
//              // PRINT a row
//              for ( int col = 0 ; col < ancho ; col++ )
//              {
//                 System.out.print( "*" ) ;
//              }
//              // PRINT newline
//              System.out.println( "" ) ;
//           }


        

//        
//        System.out.println("----------------");
//        
//        
//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print("@");
//            }
//            System.out.println("");
//        }

        
           



        
        
        
        
        
        
    }
    
}
