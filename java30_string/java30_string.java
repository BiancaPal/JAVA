/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java30_string;

/**
 *
 * @author Alex
 */
public class java30_string {
    public static void main(String args[]){  
        
        double euros = 12.438;
        
        String cadena = String.format("%.2f €", euros); // store as string chain
        
        System.out.printf(cadena); 
}
}
