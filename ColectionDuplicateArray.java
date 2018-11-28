package com.java.ThreadExample;
import java.util.*;
public class ColectionDuplicateArray {

     public static void main(String []args){
       //46 | 12 |  1 | 73 | 50 | 92 | 88 | 23 | 30 | 66 
       a.add(46);
        a.add(88);a.add(30);a.add(23);a.add(66);
       a.add(12);a.add(1);a.add(73);a.add(15);a.add(93);
       a.add(88);a.add(30);a.add(23);a.add(66);
       
       for(Integer as:a){
           System.out.print(as+" ");
       }
       System.out.println("\n");
       Collections.sort(a);
       
       for(Integer as:a){
           System.out.print(as+" ");
       }
       
        ArrayList<Integer>a1=new ArrayList<>();
        
         for(Integer as:a){
          if(!a1.contains(as))
           a1.add(as);
       }
        System.out.println("\n printing out\n");
      
         for(Integer as:a1){
           System.out.print(as+" ");
       }
       
     }
}
