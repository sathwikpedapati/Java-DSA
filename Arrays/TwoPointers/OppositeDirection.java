import java.util.*;
public class OppositeDirection{
     public static void main(String args[]){
      int [] arr ={1,2,3,4,5,6};
      int [] brr ={2,7,11,15};
      reverse(arr,0 ,arr.length-1);
      System.out.println(" ");
      System.out.println(palindrome("sathwik"));
      System.out.println(Arrays.toString(twosum(brr,9)));
    }
     public static void reverse(int [] arr,int s,int e){
        // Main Intution is two pointers are moving opposite direction 
        // Start Increasing and Ending Decreasing
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        System.out.print(Arrays.toString(arr));
     }
     public static boolean palindrome(String str){
        // Same like reverse
        // madam --> compare m at first and m at end if there are match then increase the start and decrease the end until s>e
        // if not matches then return false
         int s=0;
         int e=str.length()-1;
         while(s<=e){
            if(str.charAt(s)!=str.charAt(e)){
                return  false;
            }else{
                s++;
                e--;
            }
         } 
         return true;
     }
     public static int [] twosum(int[]arr,int target){
        // Array must be sorted
        // if arr[s]+arr[e]==target then return indexes
        // sum>target e--
        // sum<targer s++
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            if(arr[s]+arr[e]>target){
                e--;
            }else if(arr[s]+arr[e]<target){
                s++;
            }else{
                return new int []{s,e};
            }
        }
        return new int[]{};
     }
}