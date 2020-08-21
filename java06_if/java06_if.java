/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java06_if;

/**
 *
 * @author Alex
 */
public class java06_if {
    public static void main(String[] args){
    
        int numero1 = 18;
        int numero2 = 25;
        String nom = "Pere";
        String poble = "Menarguens";
    
   
        if (numero1 > numero2){
            System.out.printf("%d és més gran"+" que %d ",numero1,numero2);
        }else {
            System.out.printf("%d és més petit"+" que %d", numero1,numero2);
        }
        
        System.out.printf("\n");
        
        
        int numeroComparatiuMenor=20;
        int numeroComparatiuMajor=30;
        
        if (numeroComparatiuMenor >= numero2  &&  numero2 <= numeroComparatiuMajor ){
            System.out.printf("%d está comprés"+"entre 20 "+"i 30",numero2);
        }else {
            System.out.printf("%d no está comprés entre "+ "20 y 30", numero2);
        }
        
        
        System.out.printf("\n");
        
        if (nom=="Pere"){
            System.out.printf("El nom es Pere");
        }else {
            System.out.print("El nom no és Pere");
        }
        
        System.out.printf("\n");
        
        if (nom == "Pere" || poble == "Menarguens" ){
            System.out.printf("Nom o poble correctes");
        }else {
            System.out.print("Nom i/o poble incorrecte");
        }
        
        System.out.printf("\n");
        
        int suma = numero1 + numero2;
        
        if (suma > 40){
            System.out.printf("%d és més gran que 40 ", suma);
        }else {
            System.out.printf("%d no és més gran que 40", suma);
        }
        
        System.out.printf("\n");
        
        if ( numero2 % 2 == 0){
            System.out.printf("%d és parell", numero2);
        }else{
            System.out.printf("%d és imparell", numero2);
        }
        
        System.out.printf("\n");
        
        
         
    }
}
