/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java33_double;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class java33_double {
    
    public static void main(String args[]){  
       Scanner lector = new Scanner(System.in); 
        
       System.out.println("Please enter price"); 
        
      
       String euros = lector.nextLine();  
      
       
       double dobleEuros = Double.parseDouble(euros);
       
       double iva = (dobleEuros/(1.21));
       
       System.out.printf("Euros: %.2f € \n",dobleEuros);
       System.out.printf("Iva: %.2f €", iva);
        
    }
    
}
