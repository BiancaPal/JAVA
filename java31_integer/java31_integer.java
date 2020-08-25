/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java31_integer;

/**
 *
 * @author Alex
 */

import java.util.Scanner; 

public class java31_integer {
     public static void main(String args[]){  
         
          Scanner lector = new Scanner(System.in); 
          
           System.out.println("Enter red value");
  
           String r= lector.nextLine();
           
           int rd= Integer.parseInt(r,16);
           
           
           System.out.println("Enter green value");
  
           String g= lector.nextLine();
           
           int gr = Integer.parseInt(g,16);
           
           
           System.out.println("Enter blue value");
  
           String b= lector.nextLine();
    
           int bl= Integer.parseInt(b,16);
           
           
        
      
           System.out.print("RGB : "+rd+", "+gr+", "+bl);
    }
}
