/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java65_classe;

import java64_classe.java64_classe;

/**
 *
 * @author Alex
 */
public class java65_classe {
    String nom;
    Double nota;
    
        public String aCadena(){
            return "Nom: "+ nom+ " Nota: "+nota;
      
        }
        
        public void baixaNota(){
            nota = nota -1.0;
        }
        public void pujaNota(){
            nota = nota +1.0;
        }
        
        
        public static void main(String[] args) {
                 java65_classe primera= new java65_classe();
                 
                 primera.nom ="Jaume";
                 primera.nota = 5.5;
                 
                 java65_classe segona= new java65_classe();
                 segona.nom = "Anna";
                 segona.nota = 7.2;
                 
                 java65_classe tercera=new java65_classe();
                 tercera.nom ="Maria";
                 tercera.nota = 8.0;
                 
                 java65_classe quarta= new java65_classe();
                 
                 quarta.nom ="Jaume";
                 quarta.nota = 3.6;
                 
                 java65_classe cinquena= new java65_classe();
                 cinquena.nom = "Anna";
                 cinquena.nota = 7.6;
                 
                 java65_classe sisena= new java65_classe();
                 sisena.nom ="Maria";
                 sisena.nota = 4.5;
                 
                 java65_classe setena=new java65_classe();
                 setena.nom ="Jaume";
                 setena.nota =5.1;
                 
                 java65_classe vuitena= new java65_classe();
                 vuitena.nom ="Maria";
                 vuitena.nota=5.8;
        
                
                 primera.baixaNota();
                 segona.pujaNota();
                 
                 System.out.println(primera.aCadena());
                 System.out.println(segona.aCadena());
                 System.out.println(tercera.aCadena());
                 System.out.println(quarta.aCadena());
                 System.out.println(cinquena.aCadena());
                 System.out.println(sisena.aCadena());
                 System.out.println(setena.aCadena());
                 System.out.println(vuitena.aCadena());
                 
                 
    

            }
        
       
}
