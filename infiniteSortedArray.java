/*
Find position of an element in Infinite sorted array
 */
package binarySearch;

/**
 *
 * @author User
 */
public class infiniteSortedArray {
    public static void main(String[] args){
        
    
    
    }
    public static int range(int[] inf, int target){
        //Find the range
        //Start with a box of size 2
        int start =0;
        int end =1;
        // condition for the target to lie in the range
        while(target>inf[end]){
            int newStart = end+1;
            //double the box
            // end = previous end +Sizeof box*2
            end = end+(end-start+1)*2;
            start = newStart;
        
        }
        return binarySearch(inf, target, start,end);
    }
    public static int binarySearch(int[]a , int x, int l, int r){
        while(l<=r){
            int mid = l + ((r-l)/2);
            if(a[mid]== x)
                return mid;
            else if(x>a[mid])
                l = mid+1;
            else
                r = mid-1;
        }
        return -1;
    }
}
