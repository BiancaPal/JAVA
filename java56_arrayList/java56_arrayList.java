/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java56_arrayList;

/**
 *
 * @author Alex
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class java56_arrayList {
     public static void main(String[] args) {
         
    ArrayList<String> noms = new ArrayList<String>();
    noms.add("Jaume");
    noms.add("Anna");
    noms.add("Maria");
    
    ArrayList<Double> notes = new ArrayList<Double>();
    notes.add(5.5);
    notes.add(3.6);
    notes.add(5.1);
    notes.add(7.2);
    notes.add(7.6);
    notes.add(8.0);
    notes.add(4.5);
    notes.add(5.8);
    
    double suma1 = 0.0;
    double suma2 = 0.0;
    double suma3 = 0.0;
    
    System.out.println(notes);
    
    for (int i = 0; i < noms.size(); i++) {
      for (int j = 0; j <notes.size(); j++){
          
              if (j<3){
                  suma1=suma1 + notes.get(j);
                  
              } 
          
              if(j>=3 && j<5){
                  
                 suma2=suma2 + notes.get(j);
                 
              }
              
              if (j>=5 && j<=notes.size()){
                  
                 suma3=suma3 + notes.get(j);  
              } 
            
         }
         
        suma1=suma1/6;
        suma2=suma2/4;
        suma3=suma3/6;
    }
    System.out.print(noms.get(0));
    System.out.printf(" %.2f \n",suma1);
    System.out.print(noms.get(1));
    System.out.printf(" %.2f \n",suma2);
    System.out.print(noms.get(2));
    System.out.printf(" %.2f \n",suma3);
    
    double[] maxV={suma1, suma2, suma3};
    
    double max = Arrays.stream(maxV).max().getAsDouble();

 
    System.out.printf("La nota mitjana més alta és %.2f", max);
    
      
  }
}
