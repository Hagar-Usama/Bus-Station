/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_station;

import java.util.ArrayList;


/**
 *
 * @author toshiba
 */
public class Additional {
     
 
    
   public String commaSeparate(ArrayList<Integer> v){
     String word = null;
     for (int counter = 0; counter < v.size(); counter++) { 		      
          	
         word=word+","+v.get(counter);	
      }   		
   
return word;
}}