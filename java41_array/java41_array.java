/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java41_array;

import java.util.Random;

import java.lang.Math;
import java.util.Arrays;

/**
 *
 * @author Alex
 */
public class java41_array {
     public static void main(String args[]){  
        
         
        int[] array = new int[10];

       for (int i = 0; i < array.length; i++) {
           array[i] = (int) (Math.round( (Math.random() * 30) ));
       }

      System.out.println(Arrays.toString(array));
        
       
    }
}
