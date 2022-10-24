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
public class flooring {
    public static void main(String[] args){
        int[] a = {2,3,5,9,14,16,18};
        int target = 5;
        int ceilingNum = flooringSearch(a, target);
        System.out.println(ceilingNum);
        
    }
    public static int flooringSearch(int[] a, int t){
        int c = -1;
        int low = 0;
        int high = a.length-1;
        int mid;
        
        while(low<=high){
            mid = low+((high-low)/2);
            if(a[mid]==t){
                c = a[mid];
                break;
            }
            else if(a[mid]<t){
                c = a[mid];
                low= mid+1;
            }
            else 
                high = mid-1;
        }
        return c;
    }
}
