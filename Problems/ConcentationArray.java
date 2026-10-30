import java.util.Arrays;

public class ConcentationArray {
    public static  void main(String[] args){
        int [] nums={1,2,1};
        // Result Array is  Two Times * size of the Original Array
        // Res[i]=nums[i]
        // Res[i+n]=nums[i]
        System.out.println(Arrays.toString(TraditionalApproach(nums)));
        System.out.println(Arrays.toString(ClassicalApproach(nums)));
    }
    static  int [] TraditionalApproach (int []nums){
        // Single Pass
        // Time Complexity -O(n)
        // Space Complexity -O(n) n means 2*size of the array
        int [] res = new int [2* nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
            res[i+nums.length]=nums[i];
        }
        return res;
    }
    static  int [] ClassicalApproach(int [] nums){
        //  Two Pass for this Approach
        // Time Complexity - O(n*n)
        // Space Complexity-O(n) --> n==2*size of the array
        int [] res=new int [2*nums.length];
        int idx=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<nums.length;j++){
                res[idx]=nums[j];
                idx++;
            }
        }
        return res;
    }
}
