/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java52_arrayList;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class java52_arrayList {
     public static void main(String[] arg) 
    { 
       
       
       ArrayList<Integer> llista = new ArrayList<Integer>();
       
       int[] fib= new int[10];
       
       fib[0]=0;
       fib[1]=1;
       llista.add(fib[0]);
       llista.add(fib[1]);
       
       int num1 = 0;
       
       for (int i=0; i<fib.length; i++){
           
           
           if (i>=2){
               
               num1=fib[i-1]+fib[i-2];
           
               fib[i]=num1;
               
               llista.add(fib[i]);
           }
           
           
       }
       System.out.println(llista);
      
    }
    
}
