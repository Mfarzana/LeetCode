/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Farzana
 */
public class RankTransformOfArray {
    
 public int[] arrayRankTransform(int[] arr) {
     
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i: temp){
            map.putIfAbsent(i,map.size()+1);
        }
        for(int i=0;i<arr.length;i++){
            temp[i]=map.get(arr[i]);
        }
        
        return temp;
        
    }
}