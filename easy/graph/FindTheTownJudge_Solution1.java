/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Farzana
 */
/*
n a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.

If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.

 

Example 1:

Input: N = 2, trust = [[1,2]]
Output: 2
Example 2:

Input: N = 3, trust = [[1,3],[2,3]]
Output: 3
Example 3:

Input: N = 3, trust = [[1,3],[2,3],[3,1]]
Output: -1
Example 4:

Input: N = 3, trust = [[1,2],[2,3]]
Output: -1
Example 5:

Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
Output: 3
 
*/
public class FindTheTownJudge_Solution1 {
    
         public int findJudge(int N, int[][] trust) {
                        if(N==1) return 1;
                     
                        List<Integer> trustList=new ArrayList<>();
                        /*
                         // <Judge, Count>         
                        count is the number of how many people trusted judge
                        for example<3 2> 3 truested 2 people   [[1,3],[2,3]]]                        
                        
                        */
                        HashMap<Integer,Integer> judgeMap=new HashMap<>();        // <Judge, PeopleTruested>

                        for(int[] i: trust){            

                            trustList.add(i[0]); // list who truested other
                            if(judgeMap.containsKey(i[1])){    
                                //It will update the value for the existing mapping.
                                //Here I am updating to increment value by 1.
                                judgeMap.put(i[1], judgeMap.get(i[1]) + 1);

                            }else{
                                judgeMap.put(i[1],1);
                            }

                            //System.out.print(" "+i[0]+" "+i[1]);
                        }

                        for (Map.Entry<Integer, Integer> entry : judgeMap.entrySet()) {
                                        Integer judge = entry.getKey();
                                        Integer peopleTruested = entry.getValue();
                                        if(! trustList.contains(judge) && peopleTruested ==N-1) // va
                                            return judge;
                                        /*
                                        Everybody (except for the town judge) trusts the town judge
                                        thats mean if total people N=4 thats mean trust by 3 people except judge (N-1SS)
                                        */
                         }


                    return -1;
         }
}