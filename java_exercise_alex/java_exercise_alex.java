/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_alex;

/**
 *
 * @author Alex
 */
public class java_exercise_alex {
    
     public static void main(String[] args) {
         
         int [] myNum = {1,3,4,5,8,9,1,1,9,8,8};
         
         int count=0;
         
         for (int i=0; i<myNum.length;i++){
             if (myNum[i]== 1){
               count++;
             }
             if (myNum[i]==8){
                 count ++;
             }

         }
         
         System.out.print(count);
         
         if (count % 2 == 0){
             int total = count/2;
             System.out.print(" "+total);
         }else{
             double notTotal = count/2;
             int notTotalI= (int) notTotal;
             System.out.print(" "+notTotalI);
         }
         
     }
     
     
}
