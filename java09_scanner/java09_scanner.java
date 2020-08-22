/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java09_scanner;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class java09_scanner {
    
    public static void main(String[] args){
        
        Scanner lector = new Scanner(System.in); //Create a Scanner Object
        
        System.out.println("Escriu preu");
        
        float preu = lector.nextFloat(); // Read user input
        
        double iva = preu + (preu * 0.21);
        
        double dollars = iva * 1.18;
        
        System.out.printf("El preu és: %.2f€ \n", preu); //Output user input
        System.out.printf("El preu  amb IVA és %.2f€ \n", iva); //Output user input
        System.out.printf("El preu  amb dollars és %.2f$ \n", dollars); //Output user input
        
        
        
        
    }
    
    
}
