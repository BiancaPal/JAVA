/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java63_classe;


/**
 *
 * @author Alex
 */
public class java63_classe {
       
        
        private String[] noms={"Jaume","Anna","Maria","Jaume","Maria","Jaume","Anna","Maria"};
        
        private double[] notes={5.5, 7.2, 8, 3.6, 4.5, 5.1, 7.6, 5.8};
        
        
        public String[] getNomsArray(){
            return noms.clone();
        }
        
        public double[]getNotesArray(){
            return notes.clone();
        }
        
        public static void main(String[] args) {
            java63_classe nom= new java63_classe();
            
             String[] nomsArray = nom.getNomsArray();
             double[] notesArray = nom.getNotesArray();
             
             for (int i=0; i<nomsArray.length;i++){
                 
                 System.out.print(nomsArray[i]+" "+notesArray[i]+"\n");
             }
             
             
        }
    }
   
    


