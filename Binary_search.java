/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarySearch;

/**
 *
 * @author User
 */
public class Binary_search {
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,9,10};
        int n = 112;
        //boolean result = searchRecursive(arr, n, 0, arr.length-1);
        boolean r = searchIterative(arr,n);
        System.out.println(r);
    }
    
    public static boolean searchIterative(int[] a, int x){
        //print FOUND/NOT FOUND along with index number
        int l = 0;
        int r = a.length-1;
        while(l<=r){
            int mid = l + ((r-l)/2);
            if(a[mid]== x)
                return true;
            else if(x>a[mid])
                l = mid+1;
            else
                r = mid-1;
        }
        return false;
    }
       
    public static boolean searchRecursive(int[] a, int x, int left, int right){
        if(left>right){
            return false;
        }
        int mid = left+((right-left)/2); 
        if (a[mid] == x)
            return true;
        else if (x>a[mid])
            return searchRecursive(a,x, mid+1, right);
        else
            return searchRecursive(a,x, left, mid-1);  
    } 
}
