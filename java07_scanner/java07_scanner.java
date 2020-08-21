/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java07_scanner;

/**
 *
 * @author Alex
 * 
 */

import java.util.Scanner;
public class java07_scanner {
    public static void main(String[] args){
        
        Scanner lector = new Scanner(System.in); //Create a Scanner Object
        
        System.out.println("Enter number");
        
        int numero = lector.nextInt(); // Read user input
        
        System.out.println("Numero es: "+ numero); //Output user input
        
    }
    
    
    
}
