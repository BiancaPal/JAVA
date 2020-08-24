/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java21_string;

/**
 *
 * @author Alex
 */
public class java21_string {
    public static void main(String[] args)  
    { 
       String str = "Numero de paraules de la frase"; // string chain
       
       String[] arrOfStr= str.split(" "); // making an array out of the split method
      
       for (String a : arrOfStr)
           System.out.println(a); //looping the array per line and word
    } 
}
