/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java13_scanner;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class java13_scanner {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in); //Create a Scanner Object
       
    System.out.println("Escriu un numero sencer");  
    
    int myInt1 = lector.nextInt();
    double myDouble1 = myInt1; // Automatic casting: int to double

    System.out.println("Escriu un numero sencer");  
   
    
    int myInt2 = lector.nextInt();
    double myDouble2 = myInt2; // Automatic casting: int to double

    System.out.println("Escriu un numero sencer");  
    
    int myInt3 = lector.nextInt();
    double myDouble3 = myInt3; // Automatic casting: int to double
    
    double suma= myDouble1 + myDouble2 + myDouble3;
    double mitjana = suma / 3;

    System.out.printf("La suma total és %.2f \n ",suma);  
    System.out.printf("La mitjana és %.2f",mitjana);  
    
  }
}
