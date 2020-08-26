/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java47_vector;


/**
 *
 * @author Alex
 */

import java.util.GregorianCalendar;

public class java47_vector {
    public static void main(String[] arg) 
    { 
       GregorianCalendar calendari;
       
       calendari = new GregorianCalendar();
       
       
       for (int i=-1; i<=12; i++){
           calendari.set(1973, i, 5);
           calendari.add(GregorianCalendar.MONTH,1);  
           System.out.println(calendari.getTime() );
       }
       
      
    }
}
