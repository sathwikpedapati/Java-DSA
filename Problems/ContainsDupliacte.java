import java.util.Arrays;
import java.util.DuplicateFormatFlagsException;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDupliacte {
    public static  void main(String [] args){
        int [] arr={1,2,3,1};
        System.out.println(BruteForceApproach(arr));
        System.out.println(SortingApproach(arr));
        System.out.println(HashingApproach(arr));
        System.out.println(MyApproach(arr));
        System.out.println(RemoveDuplicates(arr));
        System.out.println(HashTableApproach(arr));
    }
    static  boolean BruteForceApproach(int [] nums){
        // Time Complexity -->O(n*n)
        // Space Complexity -->O(1)
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return  true;
                }
            }
        }
        return false;
    }
    static  boolean SortingApproach(int [] nums){
        // Time Complexity is O(n*log(n)) for sorting purpose
        // Space Complexity is O(1)
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
    static  boolean HashingApproach(int [] nums){
        // Time Complexity is O(n) for Single Iteration
        // Space Complexity is O(n) for HashSet
        HashSet<Integer> seen = new HashSet<>();
        for(int n:nums){
            if (seen.contains(n)) {
                return true;
            }
            seen.add(n);
        }
        return false;
    }
    static  boolean MyApproach(int [] nums){
        // Time Complexity is O(n)
        // Space Complexity is O(n)
        HashSet<Integer>  a= new HashSet<>();
        for(int n:nums){
            a.add(n);
        }
        return a.size()<nums.length;
    }
    static  boolean RemoveDuplicates(int [] nums){
        // Time Complexity is O(n)
        // Space Complexity is O(n)
        return  Arrays.stream(nums).distinct().count()<nums.length;
    }
    static  boolean HashTableApproach(int [] nums){
        // Time Complexity is O(n)
        // Space Complexity is O(n) for HashMap
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int n:nums){
            if(a.containsKey(n)){
                a.put(n,a.get(n)+1);
            }else{
                a.put(n,1);
            }
        }
     for(int val:a.keySet()){
         if(a.get(val)>=2){
             return  true;
         }
     }
     return false;
    }
}
