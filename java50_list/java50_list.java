/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java50_list;

import java.util.ArrayList; 


/**
 *
 * @author Alex
 */
public class java50_list {
     public static void main(String[] arg) 
    { 
       
       
       ArrayList<String> llista = new ArrayList<String>();
       
       
       
       for (int i=1; i<12; i++){
           llista.add("2020-"+i+"-01");
       }
       System.out.println(llista);
      
    }
}
