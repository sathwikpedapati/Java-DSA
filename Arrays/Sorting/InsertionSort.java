package Arrays.Sorting;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int [] n={5,2,190,89,67,1};
        sorting(n); 
    }
    static void sorting(int [] nums){
        // Outer Loop  i Run from 0 to nums.length-2
        // Inner Loop  j=i+1 to j>0 if a[j-1]>a[j] then swap
        // {5,2,4,3,1}
        // {2,5,4,3,1} Step 0
        // {2,4,5,3,1} Step 1
        // {2,3,4,5,1} Step 2
        // {1,2,3,4,5} Step 3
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
