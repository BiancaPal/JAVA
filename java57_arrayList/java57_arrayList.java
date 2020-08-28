/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java57_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Alex
 */
public class java57_arrayList {
     public static void main(String[] args) {
         
    ArrayList<String> noms = new ArrayList<String>();
    noms.add("Jaume");
    noms.add("Anna");
    noms.add("Maria");
    noms.add("Albert");
   
    ArrayList<Double> temps1 = new ArrayList<Double>();
    
    
    temps1.add(54.2);
    temps1.add(48.7);
    temps1.add(51.6);
    temps1.add(57.8);
   
    
    ArrayList<Double> temps2 = new ArrayList<Double>();
    
    temps2.add(55.2);
    temps2.add(45.6);
    temps2.add(48.9);
    temps2.add(58.0);
    
    
     ArrayList<Double> temps3 = new ArrayList<Double>();
    
    temps3.add(54.2);
    temps3.add(47.3);
    temps3.add(52.7);
    temps3.add(58.7);
    
    
    ArrayList<Double> temps4 = new ArrayList<Double>();
    
    temps4.add(56.8);
    temps4.add(49.6);
    temps4.add(50.4);
    temps4.add(57.3);
    
    
    ArrayList<Double> temps5 = new ArrayList<Double>();
    
    temps5.add(52.9);
    temps5.add(48.6);
    temps5.add(49.7);
    temps5.add(58.4);
    
    for (int i = 0; i < noms.size(); i++) {
        
        if (temps1.get(i) < temps2.get(i)){
            temps2.set(i,temps1.get(i));
        }
        
        if (temps2.get(i) < temps3.get(i)){
            temps3.set(i,temps2.get(i));
        } 
        
        if (temps3.get(i) < temps4.get(i)){
            temps4.set(i,temps3.get(i));
        } 
        
        if (temps4.get(i) < temps5.get(i)){
            temps5.set(i,temps4.get(i));
        } 
        
        else{
            temps2.set(i,temps1.get(i));
            temps3.set(i,temps2.get(i));
            temps4.set(i,temps3.get(i));
            temps5.set(i,temps4.get(i));
        }
        
        System.out.print(noms.get(i)+" ");
        for(int t = 0; t< temps1.size(); t++){
            if(t==0){
            System.out.print(temps1.get(i)+" ");
            }
            if(t==1){
            System.out.print(temps2.get(i)+" ");
            }
            if(t==2){
            System.out.print(temps3.get(i)+" ");
            }
            if(t==3){
            System.out.print(temps4.get(i)+" ");
            }
            if(t==4){
            System.out.print(temps5.get(i)+" ");
            }
            
        }
        System.out.print(" \n");
        
        
    }
   /* System.out.println(" "+temps1);  
    System.out.println(" "+temps2);  
    System.out.println(" "+temps3);  
    System.out.println(" "+temps4);  
    System.out.println(" "+temps5);    
     */
    }
    
    
    
}
