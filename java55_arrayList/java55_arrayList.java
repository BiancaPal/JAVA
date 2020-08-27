/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java55_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author Alex
 */
public class java55_arrayList {
    
    public static void main(String[] arg) 
    { 
       List<Object> llista = new ArrayList<Object>();
       
       Object[] obj={"Jaume", 10, "Maria", 8.5, "Pere", 6.43, true};
        for (int i=1; i<obj.length; i++){
           llista.add(obj[i]);
       }
       Iterator<Object> iterador = llista.iterator();
       
       while(iterador.hasNext()){
                System.out.println(iterador.next()); 
       }
            
    }  
}
