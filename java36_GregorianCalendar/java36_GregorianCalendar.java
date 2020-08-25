/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java36_GregorianCalendar;

import java.util.GregorianCalendar;

/**
 *
 * @author Alex
 */
public class java36_GregorianCalendar {
     public static void main(String args[]){  
       
        
       GregorianCalendar calendari;
       
       calendari = new GregorianCalendar();
       
       System.out.print(calendari.get(GregorianCalendar.YEAR)+" - "+ calendari.get(GregorianCalendar.MONTH)+" - "+calendari.get(GregorianCalendar.DAY_OF_MONTH)+"\n");
       
       System.out.print(calendari.getTime());
       

          
          
          
        
    }
}
