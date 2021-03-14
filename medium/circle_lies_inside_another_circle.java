/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101.coding.problems;

/**
 *
 * @author Farzana
 */
/*
To check if circle 2 inside circle 1,

compute d 
    d = sqrt( (x2-x1)^2 + (y2-y1)^2 );
    get c2 and c1
    if c1 > ( d + c2 ) 
       circle 2 inside circle 1
    else
     circle 2 not inside circle 1
*/
public class circle_lies_inside_another_circle {
    public static void main(String agrs[]){
    
    int x1 = 10, y1 = 8, x2 = 1, y2 = 2, r1 = 30, r2 = 10 ;
    
    double d=Math.sqrt((x1 - x2) * (x1 - x2)+(y1 - y2) * (y1 - y2));
    if(r1>(d+r2))
               System.out.println(" circle 2 inside circle 1");
    else 
        System.out.println(" circle 1 inside circle 2");
    }
}
