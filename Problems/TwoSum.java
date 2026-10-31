import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class TwoSum {
    public static  void main(String [] args){
     int [] nums={3,3};
     int target=6;
        System.out.println(Arrays.toString(BruteForceApproach(nums,target)));
        System.out.println(Arrays.toString(SortingApproach(nums,target)));
        System.out.println(Arrays.toString(TwoPass(nums,target)));
        System.out.println(Arrays.toString(Onepass(nums,target)));
    }
    static  int [] BruteForceApproach (int [] nums,int target){
        // Time Complexity - O(n*n)
        // Space Complexity - O(1)
        for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
              if(nums[i]+nums[j]==target){
                  return  new int []{i,j};
              }
          }
        }
        return  new int []{};
    }
    static int [] SortingApproach(int []nums,int target){
        // Time Complexity - O(nlogn)
        // Space Complexity -O(n) used Multi Dimensional Array
        int [][] res=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            res[i][0]=nums[i];
            res[i][1]=i;
        }
        Arrays.sort(res, Comparator.comparingInt(a->a[0]));
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int result=res[i][0]+res[j][0];
            if(result==target){
                return new int[]{res[i][1],res[j][1]};
            }else if(result>target){
                j--;
            }else{
                i++;
            }
        }
        return new int []{};
    }
    static  int [] TwoPass(int [] nums,int target){
        // Time Complexity - O(n+n) -O(n)
        // Space Complexity -O(n) for HashMap
        HashMap<Integer,Integer> res= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            res.put(nums[i],i);
        }
        System.out.println(res);
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if (res.containsKey(diff) && res.get(diff)!=i){
                return new int []{i,res.get(diff)};
            }
        }
        return new int[]{};
    }
    static int [] Onepass(int [] nums,int target){
        // Time Complexity - O(n)
        // Space Complexity -O(n) for HashMap
        HashMap<Integer,Integer> a= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(a.containsKey(diff) && a.get(diff)!=i){
                int first=Math.min(i,a.get(diff));
                int second=Math.max(i,a.get(diff));
                return new int []{first,second};
            }else{
                a.put(nums[i],i);
            }
        }
        return  new int []{};
    }
}
