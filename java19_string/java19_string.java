/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java19_string;

/**
 *
 * @author Alex
 */


import java.util.Scanner;

public class java19_string {
       public static void main(String args[]) {
           
       Scanner lector = new Scanner(System.in); //Create a Scanner Object
        
        System.out.println("Escriu el teu nom");
        
        String nom = lector.next(); // Read user input
      
        System.out.println("Numero de paraules:"+nom.length());
   }
}
