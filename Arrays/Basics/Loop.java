package Arrays.Basics;

public class Loop {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        iterate(arr);
        System.out.println("-------");
        other(arr);
        System.out.println("-------");
        System.out.println(sum(arr));
    }
    static void iterate(int []nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    static int sum(int []nums){
      int s=0;
      for(int i=0;i<nums.length;i++){
        s+=nums[i];
      }
      return s;
    }
    static void other(int[]nums){
        for(int k:nums){
            System.out.println(k);
        }
    }
}
