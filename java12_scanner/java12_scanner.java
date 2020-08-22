/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java12_scanner;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class java12_scanner {
      public static void main(String[] args){
        
        Scanner lector = new Scanner(System.in); //Create a Scanner Object
        
        System.out.println("Escriu euros");
        
        float euros = lector.nextFloat(); // Read user input
        
        double[][] taula_conversio = { {0.81316, 0.76406}, {1.1745, 1.10357}, {1.5614, 1.3404}, {1.14077, 1.07188}, {9.54941, 8.97275} };
       
        double comprar_lliura = euros * taula_conversio[0][0];
        double vendre_lliura = euros * taula_conversio[0][1];
        double comprar_dolar_usa = euros * taula_conversio[1][0];
        double vendre_dolar_usa = euros * taula_conversio[1][1];
        double comprar_dolar_canadenc = euros * taula_conversio[2][0];
        double vendre_dolar_canadenc = euros * taula_conversio[2][1];
        double comprar_franc = euros * taula_conversio[3][0];
        double vendre_franc = euros * taula_conversio[3][1];
        double comprar_corona = euros * taula_conversio[4][0];
        double vendre_corona = euros * taula_conversio[4][1];
        
        
        System.out.printf("Comprar lliura és %.2f \n",comprar_lliura); //Output user input
        System.out.printf("Comprar lliura és %.2f \n",vendre_lliura); //Output user input
        System.out.printf("Comprar lliura és %.2f \n",comprar_dolar_usa); //Output user input
        System.out.printf("Comprar lliura és %.2f \n",vendre_dolar_usa); //Output user input
        System.out.printf("Comprar lliura és %.2f \n",comprar_dolar_canadenc); //Output user input
        System.out.printf("Comprar lliura és %.2f \n",vendre_dolar_canadenc); //Output user input
        System.out.printf("Comprar lliura és %.2f \n",comprar_franc); //Output user input
        System.out.printf("Comprar lliura és %.2f \n",vendre_franc); //Output user input
        System.out.printf("Comprar lliura és %.2f \n",comprar_corona); //Output user input
        System.out.printf("Comprar lliura és %.2f \n",vendre_corona); //Output user input
    }
    
}
