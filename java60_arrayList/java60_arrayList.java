/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java60_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Alex
 */
public class java60_arrayList {
     public static void main(String[] args) {
         
    ArrayList<Double> preus = new ArrayList<Double>();
    
    preus.add(21.40);
    preus.add(12.71);
    preus.add(15.20);
    preus.add(17.24);
    
   
    ArrayList<Double> quantitats = new ArrayList<Double>();
    
    quantitats.add(4.00);
    quantitats.add(5.50);
    quantitats.add(7.00);
    quantitats.add(2.90);
    
    ArrayList<Double> total = new ArrayList<Double>();
    ArrayList<Double> descompte5 = new ArrayList<Double>();
    ArrayList<Double> iva = new ArrayList<Double>();
    
    double sumaP =0;
    double sumaQ =0;
    double sumaT =0;
    double sumaD =0;
    double sumaI =0;
    
    for (int i = 0; i < preus.size(); i++) {
      
       total.add(preus.get(i)*quantitats.get(i));
       descompte5.add(total.get(i)-(total.get(i)*0.05));
       iva.add(descompte5.get(i)+(descompte5.get(i)*0.21));
       
        System.out.printf("%.2f "+"%.2f "+"%.2f "+"%.2f "+"%.2f ",preus.get(i),quantitats.get(i),total.get(i),descompte5.get(i),iva.get(i));
        sumaP=sumaP+preus.get(i);
        sumaQ=sumaQ+quantitats.get(i);
        sumaT=sumaT+total.get(i);
        sumaD=sumaD+descompte5.get(i);
        sumaI=sumaI+iva.get(i);
        
           
        System.out.print(" \n");
        
     
    }
    System.out.print(" \n");
    
    System.out.printf("%.2f"+" %.2f"+" %.2f"+" %.2f"+" %.2f",sumaP,sumaQ,sumaT,sumaD,sumaI);
    
   
    

    
      
  }
}
