/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java23_string;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class java23_string {
    public static void main(String[] args)  
    { 
        Scanner lector = new Scanner(System.in); //Create a Scanner Object
        
        System.out.println("Escriu frase");
        
        String frase = lector.next(); // Read user input
        
        int count = 0;
        
        for (int i = 0; i < frase.length(); i++) {
           if (frase.contains("la")) {
           count++;
           }
        }
        System.out.println(count); // print the total number of times the string in the contains() method was printed
    }
}
