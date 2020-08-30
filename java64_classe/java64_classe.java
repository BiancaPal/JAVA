/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java64_classe;

import java63_classe.java63_classe;

/**
 *
 * @author Alex
 */
public class java64_classe {
    
    String nom;
    Double nota;
    
        public String aCadena(){
            return "Nom: "+ nom+ " Nota: "+nota;
            
             
        }
        
        
        public static void main(String[] args) {
                 java64_classe primera= new java64_classe();
                 
                 primera.nom ="Jaume";
                 primera.nota = 5.5;
                 
                 java64_classe segona= new java64_classe();
                 segona.nom = "Anna";
                 segona.nota = 7.2;
                 
                 java64_classe tercera=new java64_classe();
                 tercera.nom ="Maria";
                 tercera.nota = 8.0;
                 
                 java64_classe quarta= new java64_classe();
                 
                 quarta.nom ="Jaume";
                 quarta.nota = 3.6;
                 
                 java64_classe cinquena= new java64_classe();
                 cinquena.nom = "Anna";
                 cinquena.nota = 7.6;
                 
                 java64_classe sisena= new java64_classe();
                 sisena.nom ="Maria";
                 sisena.nota = 4.5;
                 
                 java64_classe setena=new java64_classe();
                 setena.nom ="Jaume";
                 setena.nota =5.1;
                 
                 java64_classe vuitena= new java64_classe();
                 vuitena.nom ="Maria";
                 vuitena.nota=5.8;
        
                
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

        

