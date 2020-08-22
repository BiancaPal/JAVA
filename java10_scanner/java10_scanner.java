/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java10_scanner;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class java10_scanner {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); //Create a Scanner Object
        
        System.out.println("Enter age");
      
        float age = lector.nextInt(); // Read user input
        
       if ( age >= 18){
           System.out.printf("You are over 18" ); //Output user input
       }else{
           System.out.printf("You are under eighteen");
       }
     }
}
