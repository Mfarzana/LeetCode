/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;
/*

Suppose we have a list of dominos. Each domino has two numbers. 
Two dominos D[i] = [a, b] and D[j] = [c, d] will be same if a = c and b = d, or a = d and b = c. So one domino can be reversed
. We have to return number of pairs (i, j) for which 0 <= i < j < length of Dominos, and determine D[i] is equivalent to D[j]. 
So if the domino list is like [[1, 2], [2, 1], [3, 4], [6, 5]]. The output will be 1

*/

/*To solve this, we will follow these steps −

## let answer = 0
## for each pair p in dominos list −
        sort pair p
        Then store the frequency of each domino into D
## for b in values in D −
     answer := answer + (b * (b - 1))/2
 ## return answer
*/
import java.util.HashMap;

/**
 *
 * @author Farzana
 */
        public class NumberofEquivalentDominoPairs {

        public int numEquivDominoPairs(int[][] dominoes) {

                    HashMap<Integer, Integer> map=new HashMap<>();  

                    for(int i=0;i<dominoes.length;i++){   
                                int min=Math.min(dominoes[i][0],dominoes[i][1]);
                                int max=Math.max(dominoes[i][0],dominoes[i][1]);
                                int key=min*10+max; // make key
                                if(map.containsKey(key))
                                          map.put(key,map.get(key)+1);
                                else
                                        map.put(key,1);             
                                     }

                        Integer pairs=0;
                        for(Integer m:map.values()){
                            pairs=pairs+(m* (m-1))/2;  // The formula n(n-1)/2 for the number of pairs you can form from an n element set has many derivations, even many on this site.
                        }

                        return pairs;

                /*
                n * (n-1) / 2
                 it is a combination formula where you need to choose r element out of n and order does not matter.
                Same as NCR forumula which is N! / (N-R)! * R!
                */

            }
}
