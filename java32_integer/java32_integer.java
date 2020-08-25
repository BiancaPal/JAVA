/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java32_integer;



/**
 *
 * @author Alex
 */

import java.util.Arrays;
public class java32_integer {
    public static void main(String args[]){  
         
        String[] ips = {"11000000", "10101000", "00000010", "00000001"};
        
        int size = ips.length;
        
        int [] arr = new int [size];
        
        
       for (int i = 0; i<size ; i++){
            
            arr[i] = Integer.parseInt(ips[i],2);
                    
           
        }
        
         System.out.println(Arrays.toString(arr));
    }
}
