/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java44_array;

/**
 *
 * @author Alex
 */
public class java44_array {
    public static void main(String[] args)
    {
        int [][]posicions = new int [5][5];
      
                
        
        for(int i = 0 ;i < posicions.length;i++){  
                
            for(int j = 0 ; j < posicions[i].length; j++){  
                
                
                posicions[i][j]=(i)+((j+1)*10);
               
                
                System.out.print(posicions[i][j]+" ");  
            }  
            
            
            System.out.println(" ");
            
        }
          
        
    }
}
