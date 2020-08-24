/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java27_string;

/**
 *
 * @author Alex
 */

import java.util.Scanner; 

public class java27_string {
  public static void main(String[] args) {  
        
        Scanner lector = new Scanner(System.in); 
        
        System.out.println("Please enter String array"); 
        
       
       //For using to get the input string that was skipped of the Scanner object.(Use it when scan a string after scanning different type of  variables.)
       String s = lector.nextLine();
     
        for (int i = 0; i < s.length(); i++){
            if (i % 2 == 0){
                System.out.print(s.toUpperCase().charAt(i));
            } else{
                System.out.print(s.toLowerCase().charAt(i));
            }
        }
      
   }   
}
