/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java28_string;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class java28_string {
     public static void main(String[] args) {  
        
       Scanner lector = new Scanner(System.in); 
        
       System.out.println("Please enter Identifier"); 
        
       
       //Storing into string the first input
       String dni = lector.nextLine();
       
   
      
       System.out.println("Please enter character"); 
       
       // Storing into string the second input
       
       String c = lector.nextLine(); 
       
       // Adding the char into the string by using concat() string method
       dni = dni.concat(c);
       
       System.out.println(dni);
       
     
        
      
   }  
}
