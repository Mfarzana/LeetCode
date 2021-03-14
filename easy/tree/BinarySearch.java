/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.tree;

/**
 *
 * @author Farzana
 */
public class BinarySearch {
    public static void main (String args[]){
        int arr[] = { 2, 3, 4, 10, 40 };         
        int x = 10; 
        searchValue(arr,x);
       System.out.println("Recursive vall ");
       System.out.println(searchValueRecursive(arr,0,arr.length-1,x));
        
    }
    
    public static void  searchValue(int arr[],int val){        
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;            
            System.out.println(" mid "+mid+" start "+start+" end "+end);            
            if(arr[mid]==val){ System.out.println(" value found "+mid);}
            if(val<arr[mid])
                end=mid-1;
            else start=mid+1;
   
        }
    }
    
    public static boolean  searchValueRecursive(int arr[],int start, int end,int val){    
            int mid=(start+end)/2;            
            System.out.println(" mid "+mid+" start "+start+" end "+end);            
            if(arr[mid]==val){ 
                System.out.println(" value found "+mid);
                return true;
            }
            if(val<arr[mid]) return searchValueRecursive(arr, start, mid-1,val);
            else return searchValueRecursive(arr, mid+1, end,val);
             
           
            //return false;
   
        }
    
}
