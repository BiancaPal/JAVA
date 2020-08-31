/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java68_classe;

/**
 *
 * @author Alex
 */
public class java68_classe {
   
   private String nom;
   private String cognom;
   private int edat;
   

   // Getter name
         public String getNom() {
              return nom;
         }
         
   // Getter second name
         public String getCognom(){
             return cognom;
         }
         
   // Getter age
         public int getEdat(){
             return edat;
         }

   // Setter  name
        public void setNom(String nouNom) {
              this.nom = nouNom;
         }
    
   // Setter  second name
        public void setCognom(String nouCognom) {
              this.cognom = nouCognom;
         }
   // Setter  age
        public void setEdat(int nouEdat) {
              this.edat = nouEdat;
         }
   
   
   
  public static void main(String[ ] args) {
    java68_classe noms = new java68_classe();
    noms.setNom("Bianca");
    System.out.println(noms.getNom());
    
    java68_classe cognoms = new java68_classe();
    cognoms.setCognom("Pal");
    System.out.println(cognoms.getCognom());
    
    java68_classe edats = new java68_classe();
    edats.setEdat(21);
    System.out.println(edats.getEdat());
    
    
   }

}
