import java.util.Arrays;
// No Extra Space So That Space Complexity - O(1)
// Divide and Conquer so that Time Complexity -O(NlogN)
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 90, 67, 34, 12, 1, 1};
        Sorting(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void Sorting(int[] nums, int low, int high) {
        if (low < high) {
            // Based on the Pivot index they will divide
            int pivotIndex = partition(nums, low, high);
            // low---> pivot-1
            // pivot+1---> high
            Sorting(nums, low, pivotIndex - 1);
            Sorting(nums, pivotIndex + 1, high);
        }
    }

    static int partition(int[] nums, int low, int high) {
        int i = low;
        int j = high;
        int pivot = nums[low];
        while (i < j) {
            while (nums[i] <= pivot && i < high) {
                i++;
            }
            while (nums[j] > pivot && j > low) {
                j--;
            }
            // util they cross they swap of arr[i] and arr[j]
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        // swap pivot and arr[j]
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        // returning pivotindex
        return j;
    }
}
