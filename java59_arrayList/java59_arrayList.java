/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java59_arrayList;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class java59_arrayList {
    
     public static void main(String[] args) {
         
         ArrayList<Integer> graus = new ArrayList<Integer>();
         
         ArrayList<Double> radian = new ArrayList<Double>();
         
         
         for (int i=45; i<=360; i=i+45){
             graus.add(i);
             double radians = i*Math.PI /180.0;
             radian.add(radians);
             
             /*System.out.print(graus.get(i)+radian.get(i));*/
         }
         for (int j=0; j<graus.size();j++){
             System.out.print(graus.get(j)+" ");
        
             System.out.print(radian.get(j)+"\n");
         }
         
       
         
         
         
     }
}
