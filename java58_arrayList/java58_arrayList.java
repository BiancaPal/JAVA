/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java58_arrayList;

/**
 *
 * @author Alex
 */
import java.lang.Math;
import java.util.ArrayList;

public class java58_arrayList {
     public static void main(String[] args) {
         
         ArrayList<Double> numeros = new ArrayList<Double>();
         
         int max = 6;
         int min = 1;
         int range = max - min +1;
         
         for (int i=1; i<=max; i++){
             numeros.add(Math.random()*range);
         }
         
         for (double numero:numeros){
             int numeroInt = (int)numero;
             System.out.print(" "+numeroInt);
         }
         
         
         
     }
}
