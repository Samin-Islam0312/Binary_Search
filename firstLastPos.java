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
public class firstLastPos {
    public static void main(String[] args){
        int[] array = {5,7,7,7,7,8,8,10};
        int target = 11;
        int firstIdx = search(array, target, true);
        int lastIdx = search(array, target, false);
        System.out.println("{Start, End}: "+"{"+firstIdx+","+lastIdx+"}");
    }
    public static int search(int[] a, int t, boolean first){
        int ans = -1;
        int low = 0;
        int high = a.length-1;
        int mid =0;
        while(low<=high){
            mid = low +((high-low)/2);
            if(a[mid]<t)
                low = mid+1;
            else if (a[mid]>t)
                high = mid-1;
            else{
                ans=mid;
                if(first==true)
                    high = mid-1;
                else
                    low = mid+1;  
            }       
        }
        return ans;
    }
    
}
