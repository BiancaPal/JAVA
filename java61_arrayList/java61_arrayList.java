/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java61_arrayList;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class java61_arrayList {
     public static void main(String[] args) {
         
         ArrayList<Integer> numeros = new ArrayList<Integer>();
         
         int max = 90;
         int min = 65;
         int range = (max-min)+1;
         
         for (int i=1; i<=10; i++){
             int num = (int)(Math.random()*range)+65;
             numeros.add(num);
             
         }
         
         for (int numero:numeros){
             char character = (char)numero;
             System.out.print(character+" ");
         }
         
         
         
     } 
}
