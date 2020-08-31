/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java67_classe;

/**
 *
 * @author Alex
 */
public class java67_classe {
    private String nom;
    private Double nota;
    
    public Double getNota(){
        return nota;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setNota(Double notaNova){
        this.nota = notaNova;
        
        
    }
    public void setNom(String nomNou){
        nom = nomNou;
        
    }
    public static void main(String[] args) {
        java67_classe notes = new java67_classe();
        
        notes.setNota(3.3); // set the value of the name variable to "John"
        System.out.print(notes.getNota());
        
        java67_classe noms = new java67_classe();
        
        noms.setNom("John"); // set the value of the mark variable to 3.3
        System.out.printf(noms.getNom());
    }
    
    
    
}
