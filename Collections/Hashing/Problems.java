import java.util.*;
public class Problems {
    public static void main(String[] args) {
        int []nums={2,7,11,15};
        int target =9;
       System.out.println(Arrays.toString(method(nums, target)));
    }
    static int []method(int []nums,int target){
       HashMap <Integer,Integer> a= new HashMap<>();
       for(int i=0;i<nums.length;i++){
         int c=target-nums[i];
         if(a.containsKey(c)){
            return  new int[]{i};
         }
         a.put(nums[i],i);
       }
       System.out.println(a);
       return new int[]{};
    }
}
