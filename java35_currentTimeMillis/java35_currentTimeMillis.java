/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java35_currentTimeMillis;

/**
 *
 * @author Alex
 */

import java.util.Scanner; 

public class java35_currentTimeMillis {
     public static void main(String args[]){  
       
        
         Scanner lector = new Scanner(System.in); 
        
         System.out.println("Please enter String array"); 
         long start = System.currentTimeMillis();
     
         
         String s = lector.nextLine();
         
         long end = System.currentTimeMillis();

         System.out.println("Took : " + ((end - start) / 1000));
          
          
          
        
    }
}
