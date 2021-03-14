/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coidng_test_job_20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Farzana
 */
public class FavouriteColor_peopleNameList {
    private static final HashMap<String, String[]> list=new  HashMap<String, String[]>();
    
    public static List<String> nameList(String color){
             List<String> name_list=new  ArrayList<>();
             
             for(HashMap.Entry<String, String[]> mp:list.entrySet()){
                 String key=mp.getKey();
                 String[] value=mp.getValue();
                 for(String s: value){
                     if(s.equals(color)) name_list.add(key);
                 }
                 
             }
             return name_list;

    }
    public static void main(String args[]){
        list.put("Jon", new String[]{"blue", "green", "yellow"});
        list.put("Rio", new String[]{"red", "black", "yellow"});
        list.put("maik", new String[]{"bluw", "green", "orange"});
        
        System.out.println(" list of people "+nameList("green"));

    }
}
