/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchallenges;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
/**
 *
 * @author Farzana
 */
/*
Name list those are choice same color
*/
public class NamelistColorChoice {
   public static HashMap<String,String []> list=new HashMap<>(); 
   public static  List<String> getNameList(String color){
    List namList=new ArrayList();
    for(HashMap.Entry<String, String[]> datalist:list.entrySet()){
        for(String data:datalist.getValue()){
            if(data.equals(color)) namList.add(datalist.getKey());
        }
    }
     return namList;  
   }
   public static void main(String args[]){
       list.put("David", new String[]{"blue","green","yello"});
       list.put("Tom", new String[]{"white","orange","yello"});
       list.put("Jemmy", new String[]{"back","green","orange"});

      System.out.println(" Name list for "+getNameList("green"));
   }
}
