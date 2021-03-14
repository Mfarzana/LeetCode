/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Farzana
 */
/*
############   Number of Recent Calls  ############
You have a RecentCounter class which counts the number of recent requests within a certain time frame.

Implement the RecentCounter class:
RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than the previous call. 

Example 1:

Input
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]
Output
[null, 1, 2, 3, 3]

Explanation
RecentCounter recentCounter = new RecentCounter();
recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
    [ 1<-2999  not pull, queue size 1 because 1 is bigger than -2999]
recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
    [ 100<-2900  not pull,  queue size 2, past all call value bigger -2900 ]
recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
    [ 3001<(3001-3000=1) not pull, queue size 3 ,past all call value bigger than 1]
recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
    [ 3002<(3002-3000=2) queue size 3.  pull 1 because 1<2 ]

*/
public class RecentCounter {
    
Queue<Integer> queue;
    public RecentCounter() {
        queue=new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        while(queue.peek()<(t-3000)){
            queue.poll();
        }
         return queue.size();
    }
    
   
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */