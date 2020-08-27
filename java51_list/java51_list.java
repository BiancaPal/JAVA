/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java51_list;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class java51_list {
     public static void main(String[] arg) 
    { 
       
       
       ArrayList<String> llista = new ArrayList<String>();
       
       String[] nomDiesSetmana= {"Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge"};
       
       
       for (int i=1; i<nomDiesSetmana.length; i++){
           llista.add(nomDiesSetmana[i]);
       }
       System.out.println(llista);
      
    }
}
