/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java11_scanner;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class java11_scanner {
    
      public static void main(String[] args){
        
        Scanner lector = new Scanner(System.in); //Create a Scanner Object
        
        System.out.println("Escriu temperatura en graus Celsius");
        
        float temperatura_celsius = lector.nextFloat(); // Read user input
        
        double temperatura_fahrenheit = (temperatura_celsius * (9 / 5)) + 32;
       
        
        System.out.printf("La temperatura en graus Fahrenheit és %.1f", temperatura_fahrenheit); //Output user input
 
    }
    
    
}
