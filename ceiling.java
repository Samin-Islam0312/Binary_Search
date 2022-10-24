 /*
Given an array sorted [2,3,5,9,14,16,18], 
find the ceiling of a target number = 15. 
Output: 16.

Ceiling number - smallest element in the array 
greater>= target.
 */
package binarySearch;

/**
 *
 * @author saminIslam
 */
public class ceiling {
    public static void main(String[] args){
        int[] a = {2,3,5,9,14,16,18};
        int target = 13;
        int ceilingNum = ceilingSearch(a, target);
        System.out.println(ceilingNum);
        
    }
    public static int ceilingSearch(int[] a, int t){
        int c = -1;
        int low = 0;
        int high = a.length-1;
        int mid = 0;
        
        while(low<=high){
            mid = low+((high-low)/2);
            if(a[mid]==t){
                c = a[mid];
                break;
            }       
            else if(a[mid]>t){
                c = a[mid];
                high = mid-1;
            }
            else 
                low= mid+1;
        }
        //System.out.println(a[low]);
        //System.out.println(a[mid]);
        //c, c==a[mid]==a[low]
        return a[low]; 
    }
}
