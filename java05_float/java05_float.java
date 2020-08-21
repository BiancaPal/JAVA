/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java05_float;

/**
 *
 * @author Alex
 */
public class java05_float {
    public static void main(String[] args){
    float primer = 10;
    float segon = 7;
    float tercer = primer / segon;
    
   
    System.out.printf( "Divisió:"+ "%f \n", tercer);
    System.out.printf("Divisió:"+ "%.1f / "+"%.1f ="+" %.3f \n",primer,segon,tercer);
    System.out.printf("Divisió:"+ "%.2f$ / "+"%.2f$ ="+" %.2f$ \n",primer,segon,tercer);
    
     }
}
