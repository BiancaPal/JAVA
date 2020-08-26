/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java40_array;

import java.util.Arrays;

/**
 *
 * @author Alex
 */
public class java40_array {
    
     public static void main(String args[]){  
        
        int[] array = new int[10];

       for (int i = 0, j = 1; i < array.length && j <= 20; j++) {
         if (j % 2 == 0) {
            array[i] = j;
            i++;
           }
       }

      System.out.println(Arrays.toString(array));
        
       
    }
}
