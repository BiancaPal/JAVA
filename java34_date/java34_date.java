/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java34_date;

import java.util.Scanner;

/**
 
 * @author Alex
 */

import java.time.LocalDate;

public class java34_date {
    
    
      public static void main(String args[]){  
       
          LocalDate date = LocalDate.now(); //data actual
          
          LocalDate segona = LocalDate.of(1973,06,23);
          
          LocalDate tercera = LocalDate.of(2020,03,15);
          
          if (date.isAfter(segona))
              System.out.println(segona + " És passat");
              
          if (date.isBefore(tercera))
              System.out.println(tercera + " És futur");
              
        
    }
    
}
