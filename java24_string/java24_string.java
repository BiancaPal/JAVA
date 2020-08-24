/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java24_string;

/**
 *
 * @author Alex
 */
public class java24_string {
    public static void main(String[] args) {  
	String str = "primer:segon:tercer:quart";
	String subStr = ":";
	int posit = str.lastIndexOf(subStr);
	System.out.println(posit);
	
   }  
}
