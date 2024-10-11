
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class PruebaReloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int segundos=0;
        int minutos=0;
        
        for (int i = 0; i < 2; i++) {  //contador de minutos
            segundos=0;
            for (int j = 0; j < 60; j++) {  //contador de segundos
                System.out.printf("%d:%d\n",minutos,segundos);
//                try {
//                     Thread.sleep(1*100); //Dormimos estos miliseg
//                } catch (Exception e) {
//                     System.out.println(e);
//                }
                segundos++;
            }
            minutos++;
        }
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
