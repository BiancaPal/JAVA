/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java08_scanner;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class java08_scanner {
     public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); //Create a Scanner Object
        
        System.out.println("Enter name");
      
        String name = lector.next(); // Read user input
        
        System.out.println("Enter last name");
        String last_name = lector.next(); // Read user input
        
        
        System.out.println("Welcome: "+name+" "+last_name ); //Output user input
     }
}
