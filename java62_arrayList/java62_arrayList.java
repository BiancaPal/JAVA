/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java62_arrayList;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class java62_arrayList {
    
    public static void main(String[] args) {
         
         ArrayList<Object>[]llistes;
         
         llistes = new ArrayList[2];
         
         llistes[0] = new ArrayList<Object>();
         llistes[1] = new ArrayList<Object>();
         
         llistes[0].add("Joan");
         llistes[0].add("Maria");
         llistes[0].add("Núria");
         
         llistes[1].add(42);
         llistes[1].add(35);
         llistes[1].add(21);
         
         for (int i = 0; i< llistes.length; i++){
            
             System.out.print(llistes[i]);
    
         }
         
         
         
         
         
        
    }
         
         
         
 } 
    

