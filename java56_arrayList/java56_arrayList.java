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
import java.util.ArrayList;;
import java.util.Arrays;

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
      
        if (i == 0){
            for (int e = 0; e < 3; e ++){
                suma1 = suma1 + notes.get(e);
            }
        }
        
        if (i == 1){
            for (int f = 3; f < 5; f++){
                suma2 = suma2 + notes.get(f);
            }
        }
        
        if (i == 2){
            for (int g = 5; g < notes.size(); g++){
                suma3 = suma3 + notes.get(g);
            }
        }
     
    }
    
    suma1= suma1/3;
    suma2= suma2/2;
    suma3= suma3/3;
    
    System.out.print(noms.get(1));
    System.out.printf(" %.2f \n",suma1);
    System.out.print(noms.get(2));
    System.out.printf(" %.2f \n",suma2);
    System.out.print(noms.get(0));
    System.out.printf(" %.2f \n",suma3);
    
    double[] minV={suma1, suma2, suma3};
    
    double min = Arrays.stream(minV).min().getAsDouble();

 
    System.out.printf("La nota mitjana més baixa és %.2f", min);
    
      
  }
}
