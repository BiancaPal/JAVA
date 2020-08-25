/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java38_array;

/**
 *
 * @author Alex
 */
public class java38_array {
    public static void main(String args[]){  
        
        int [] numeros;
        
        numeros = new int[4];
        
        numeros[0] = 2;
        numeros[1] = -4;
        numeros[2] = 15;
        numeros[3] = -25;
        
        for (int num : numeros){
            System.out.println(num);
        }
        
        String [] noms = {"Jaume", "Maria", "Pere", "Lluis", "Albert"};
        
        for (String nom : noms){
            System.out.println(nom);
        }
        
    }
}
