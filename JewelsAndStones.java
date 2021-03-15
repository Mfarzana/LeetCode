
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Farzana
 */
public class JewelsAndStones {
    
    public int numJewelsInStones(String jewels, String stones) {
            int count=0;
            HashSet<Character> set=new HashSet<>();
            for(Character c: jewels.toCharArray())
                set.add(c);
            for(Character c: stones.toCharArray()){
                if(set.contains(c)) count++;
                }
            return count;
        }
}
