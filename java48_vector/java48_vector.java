/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java48_vector;

import java.util.GregorianCalendar;

/**
 *
 * @author Alex
 */
public class java48_vector {
     public static void main(String[] arg) 
    { 
       GregorianCalendar calendari;
       
       calendari = new GregorianCalendar();
       
       
       for (int i=-1; i<12; i++){
           calendari.set(1973, i, 5);
           calendari.add(GregorianCalendar.MONTH,1);
           System.out.println(calendari.getTime() );
       }
       for (int i=-1 ; i<6; i++){
           calendari.add(GregorianCalendar.MONTH,+2);
           System.out.println(calendari.getTime() );
       }
       
      
    }
}
