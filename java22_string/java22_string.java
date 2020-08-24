package java22_string;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */

import java.util.Scanner;

public class java22_string {
    public static void main(String[] args)  
    { 
        Scanner lector = new Scanner(System.in); //Create a Scanner Object
        
        System.out.println("Escriu frase");
        
        String frase = lector.next(); // Read user input
        
        System.out.println(frase.contains("la")); // Print true/false if contains() method is true or false
    }
 
}
