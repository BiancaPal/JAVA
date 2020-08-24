/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java29_string;

/**
 *
 * @author Alex
 */
public class java29_string {
      public static void main(String args[]) {
          
      String pi = "Número PI: ";
      
      double numero = 3.14159265359;
      
      String numV = String.valueOf(numero);

      System.out.println(pi.concat(numV) );
      
   }
}
