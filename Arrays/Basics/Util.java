package Arrays.Basics;
import java.util.Arrays;
public class Util {
    public static void main(String[] args) {
      int [] arr ={1,2,3,4,5,6};
      int [] brr ={1,2,3,4,7,9};
      int [] crr={1,2,3,4,5,6};
      // arr is less than brr lexicographically so that return negative
      Compare(arr,brr);
      // arr is equal to brr lexicographically so that return Zero
      Compare(arr, crr);
      // arr is greater than brr lexicographically so that return postive
      Compare(brr, arr);
      //  if both Arrays are Equal then return true
      Equals(arr, crr);
      // if Both Arrays are not Equal then return false
      Equals(brr, crr);
      // create the copy of the Array
      CopyOf(crr);
      // Fill the mentioned value in the Array
      Fill(crr);
      // Sorting the Array
      Sort(brr);
      // length of the array
      length(crr);
    }
    static void Compare(int []m, int []n){
        System.out.println(Arrays.compare(m,n ));
    }
    static void Equals(int []m,int[]n){
        System.out.println(Arrays.equals(m, n));
    }
    static void CopyOf(int []k){
        // if estimated length is greater than passing array then return the Zeroes in the empty spaces
        int [] l =Arrays.copyOf(k, 8);
        System.out.println(Arrays.toString(l));
        // if length is same then return the exact array
        int [] p=Arrays.copyOf(k,6);
        System.out.println(Arrays.toString(p));
    }
    static void Fill(int []s){
        Arrays.fill(s, 0);
        System.out.println(Arrays.toString(s));
    }
    static void Sort(int []s){
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
    }
    static void length(int []t){
        System.out.println(t.length);
    }
}
