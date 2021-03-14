/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.BFS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author Farzana
 */
/*
You are given a data structure of employee information, which includes the employee's unique id, their importance value and their direct subordinates' id.

For example, employee 1 is the leader of employee 2, and employee 2 is the leader of employee 3. They have importance value 15, 10 and 5, respectively. Then employee 1 has a data structure like [1, 15, [2]], and employee 2 has [2, 10, [3]], and employee 3 has [3, 5, []]. Note that although employee 3 is also a subordinate of employee 1, the relationship is not direct.

Now given the employee information of a company, and an employee id, you need to return the total importance value of this employee and all their subordinates.

Example 1:

Input: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
Output: 11
Explanation:
Employee 1 has importance value 5, and he has two direct subordinates: employee 2 and employee 3. They both have importance value 3. So the total importance value of employee 1 is 5 + 3 + 3 = 11.
*/
public class EmployeeImportance {

    public int getImportance(List<Employee> employees, int id) {
        
       Map<Integer, Employee> emap = new HashMap();
       Queue<Employee> queue = new LinkedList();
        for (Employee emp : employees)
            emap.put(emp.id, emp);
        
        queue.add(emap.get(id));
        int total = 0;

        while (queue.size() > 0) {
            Employee emp = queue.poll();
            total += emp.importance;
          
            for (int sid : emp.subordinates)
                queue.add(emap.get(sid));
        }

        return total;
    }
    
        
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};



}