import java.util.*;
public class OppositeDirection{
     public static void main(String args[]){
      int [] arr ={1,2,3,4,5,6};
      int [] brr ={2,7,11,15};
      reverse(arr,0 ,arr.length-1);
      System.out.println(" ");
      System.out.println(palindrome("sathwik"));
      System.out.println(Arrays.toString(twosum(brr,9)));
      System.out.println(validpalindrome2("deeee"));
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
     public static boolean validpalindrome2(String str) {
         // Here the Intution is where the string is comparing from both ends
         // if String is completely plaindrome then return the true
         // if not then break it create the two strings with deleting those characters which are not matched
         // eg : "axbcbaba" is string comparing on both ends in this case x  from left and b from right create new strings like deleting x and b
         // abcbaba and axbcbaa  are new formed strings check they are palindrome if both are true then return true and both are false return false if one of them are true then return true
         int i = 0;
         int j = str.length() - 1;
         while (i <= j) {
             if (str.charAt(i) != str.charAt(j)) {
                 break;
             } else {
                 i++;
                 j--;
             }
         }
         if (i > j) {
             return true;
         }
         // Using Two Stringbuilder for opeartions
         StringBuilder p = new StringBuilder(str).deleteCharAt(i);
         StringBuilder q = new StringBuilder(str).deleteCharAt(j);
         int a = 0;
         int b = p.length() - 1;
         int c = 0;
         int d = q.length() - 1;
         boolean x = true;
         boolean y = true;
         while (a <= b) {
             if (p.charAt(a) != p.charAt(b)) {
                 x = false;
                 break;
             } else {
                 a++;
                 b--;
             }
         }
         while (c <= d) {
             if (q.charAt(c) != q.charAt(d)) {
                 y = false;
                 break;
             } else {
                 c++;
                 d--;
             }
         }
         System.out.println(i);
         System.out.println(j);
         System.out.println(p);
         System.out.println(q);
         System.out.println(a+" "+b+" "+c+" "+d);
         System.out.println(x);
         System.out.println(y);
       return x||y;
     }
}