/*
An array of characters is sorted in non-decreasing order, and a gien target 
character. Return the smallest character in the awway that is larger than target.
 */
package binarySearch;

/**
 *
 * @author User
 */
public class smallestLetter {
    public static void main(String[] args){
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        //char output = smallestGreaterLetter(letters, target);
        char r = nextGreatestLetter(letters, target);
        System.out.println(r);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int low =0;
        int high = letters.length-1;
        while(low<=high){
            int mid = low+((high-low)/2);
            if(letters[mid]>target)
                high = mid;
            
            else
                low = mid+1;
        }
        System.out.println(low);
        return letters[low%letters.length];
    }
    public static char smallestGreaterLetter(char[] l, char t){ 
        char sC = 0;
        int low = 0;
        int high = l.length-1;
        int mid = 0;
        char ans =0;
        while(low<=high){
            mid = low+((high-low)/2);
            if (l[mid]>t){
                ans = l[mid];
                high = mid-1;
            }
            else 
                low = mid+1;
        }
        System.out.println(low);
        if(low ==l.length)
            return l[0];
        return ans;
        
        //return l[low%l.length];
    }
}
