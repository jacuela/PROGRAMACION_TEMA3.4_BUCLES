/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class PruebaAnidados2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }

        
        System.out.println("----------------");
        
        
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("@");
            }
            System.out.println("");
        }

        
        
        
        
        
    }
    
}
