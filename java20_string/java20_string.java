/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20_string;

/**
 *
 * @author Alex
 */

import java.util.Scanner;

public class java20_string {
    public static void main(String[] args) {
      
        Scanner lector = new Scanner(System.in); //Create a Scanner Object
        
        System.out.println("Escriu el teu nom");
        
        String nom = lector.next(); // Read user input
        
        String res = "";
        
        int lenNom = nom.length();
        
        System.out.println("Escriu el teu cognom");
        
        String cognom = lector.next(); // Read user input
        
        String cognomr = "";
        
        int lenCognom = cognom.length();
        
         if (lenNom==lenCognom){
             for (int i = lenNom-1, e = lenCognom-1; i >= 0 && e >=0;i--,e--){
            
            res = res + nom.charAt(i);
            cognomr = cognomr + cognom.charAt(e);
            } 
            System.out.println(res);
         }
        else{
            for (int i = lenNom-1; i >= 0 ;i--){
            
            res = res + nom.charAt(i);
            
            }
            for (int e = lenCognom-1; e >=0;e--){
           
            cognomr = cognomr + cognom.charAt(e);
            }
            System.out.println(res);
            System.out.println(cognomr);
         }
         
    }  
    
 }
