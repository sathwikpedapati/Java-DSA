package Arrays.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] nums={5,90,67,34,12,1,1};
        Sorting(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void Sorting(int [] nums,int low,int high){
       if(low>=high){
        return;
       }
       int start=low;
       int end=high;
       int pivot=nums[start];
       while (start<=end) {
        while(nums[start]<pivot){
            start++;
        }
        while(nums[end]>pivot){
            end--;
        }
        if(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--; 
        }
       }
       Sorting(nums, low, end);
       Sorting(nums, start, high);
    }
}
