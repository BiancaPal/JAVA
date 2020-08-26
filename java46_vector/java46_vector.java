/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java46_vector;

/**
 *
 * @author Alex
 */
import java.util.*; 

public class java46_vector {
     public static void main(String[] arg) 
    { 
  
        // create default vector 
        Vector<Integer> numbers1 = new Vector<>();
        
        numbers1.add(3);
        numbers1.add(5);
        numbers1.add(7);
        numbers1.add(9);
        numbers1.add(11);
        
        Integer[] numbersR = numbers1.toArray(new Integer[numbers1.size()]);

        
        Vector<Integer> numbers2 = new Vector<>();
        
        numbers2.add(2);
        numbers2.add(4);
        numbers2.add(6);
        numbers2.add(8);
        numbers2.add(10);
        
        Integer[] numbersS = numbers2.toArray(new Integer[numbers2.size()]);
        
        Vector<Double> division = new Vector<>();
        
        for (int i=0; i<numbersR.length ; i++) {
            double result = numbersR[i]/numbersS[i];
            division.add(result);
            System.out.println(division);
        }
        
        
    } 
}
