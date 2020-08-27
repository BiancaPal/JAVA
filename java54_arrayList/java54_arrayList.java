/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java54_arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class java54_arrayList {
    
    public static void main(String[] arg) 
    { 
       
       Object[] obj={"Jaume", 10, "Maria", 8.5, "Pere", 6.43, true};
       
       String[] stringArray = new String[obj.length];
       
       int[] intArray = new int[obj.length];
       
       double[] doubleArray = new double[obj.length];
       
       
       for (int e=0; e<7;e++){
           if (obj[e] instanceof Integer){
               intArray[e] = (int)obj[e];
               System.out.print(intArray[e]);
           }
           if (obj[e] instanceof String){
               stringArray[e] = String.valueOf(obj[e]);
               System.out.print(stringArray[e]);
           }
           if (obj[e] instanceof Double){
               doubleArray[e] = (double)obj[e];
               System.out.print(doubleArray[e]);
           }
           
       }
       
       boolean empty = true;
      
       System.out.print("\n");
       for (int numero:intArray){
  
           if (numero == 0){
               System.out.print("");
           }else{
               System.out.print(" "+numero);
           }
       }
       
       System.out.print("\n");
       for (String string:stringArray){
           
           if (string != null && !string.isEmpty()) {
                 System.out.print(" "+string);
                }
           
       }
       
       System.out.print("\n");
       for (double doubl:doubleArray){
           if (doubl == 0.0){
               System.out.print("");
           }else{
                   System.out.print(" "+doubl);
                   }
       }
      
    }
}
