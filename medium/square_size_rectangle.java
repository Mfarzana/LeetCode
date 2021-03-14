/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101.coding.problems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Farzana
 */
public class square_size_rectangle {
    
      public static void main(String agrs[]){

          List<Integer> list =sqInRec(5, 3);
          System.out.print("list    "+list.toString());

      }
       public static List<Integer> sqInRec (int length, int width) {
                List<Integer> list;
                list= new ArrayList<>();
                while(length!=width){
                      if(length>width){
                         length = length-width;
                         list.add(width);
                      }else{
                          width = width- length;
                          list.add(length);
                      }
                }
                if(list.size()>0){
                      list.add(length);
                      return list;
                }

                return null;
        }
}
