import java.util.*;
public class ThreeSum{
   public static void main(String[] args) {
    int [] nums={-2,-2,-2,-1,-1,-1,0,0,0,1,1,2,2,2};
    problem(nums);
    optimal(nums);
   }
   static void problem(int []nums){
      // this problem can be solved using Hashing
      // first iterate the loop then for i-0 to n
      // second loop for j=i+1 to n
      // nums[i]+nums[j]+nums[k]=0  --> nums[k]=-(nums[i]+nums[j])
      // check  result is available in hashet or not
      // Here We use set for avoid duplicates
      Set<List<Integer>> res = new HashSet<>();
      for(int i=0;i<nums.length;i++){
         HashSet<Integer> b =new HashSet<>();
         for(int j=i+1;j<nums.length;j++){
            int third=-(nums[i]+nums[j]);
            // If contains then add into the arraylist and sort is for to avoid the repeated duplications
            if(b.contains(third)){
               ArrayList<Integer> in = new ArrayList<>();
               in.add(nums[i]);
               in.add(nums[j]);
               in.add(third);
               Collections.sort(in);
               res.add(in);
            }
            // not matches then add into hashset 
            b.add(nums[j]);
         }
      }
      System.out.println(new ArrayList<>(res));
   }
   static void optimal(int [] nums){
      // To Avoid Duplicates then we need to sort them 
      Arrays.sort(nums);
      List<List<Integer>> result= new ArrayList<>();
      for(int i=0;i<nums.length;i++){
          if(i>0 && nums[i]==nums[i-1]){
               continue;
         }
         int j=i+1;
         int k=nums.length-1;
         while(j<k){
            int res=nums[i]+nums[j]+nums[k];
            if(res==0){
               ArrayList<Integer> a=new  ArrayList<>();
               a.add(nums[i]);
               a.add(nums[j]);
               a.add(nums[k]);
               result.add(a);
               j++;
               k--;
            while(j<k && nums[j]==nums[j-1]) j++; // compare with adjacent elements which is equal then  update the j
            while(j<k && nums[k]==nums[k+1]) k--; // compare with adjacent elements which is equal then  update the k
            }else if(res<0){
               j++;
            }else{
               k--;
            }
         }
      }
      System.out.println(result);
   }
}