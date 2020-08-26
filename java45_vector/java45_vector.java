/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java45_vector;

/**
 *
 * @author Alex
 */

import java.util.*;

public class java45_vector {
   public static void main(String[] args)
    {
        Vector v = new Vector(10,10);
        
        for(int i=0; i<v.size(); i++){
            v.addElement(new Integer(i*10));
            
        }
        
        
    }
}
