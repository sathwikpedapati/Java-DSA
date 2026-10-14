import java.util.ArrayList;
// Time Complexity -O(n*log(n))
// Space Complexity -O(N) for Extra Space -Extra List
public class MergeSort{
   public static void main(String[] args) {
    int [] arr ={9,8,7,67,90,1};
    ms(arr, 0, arr.length-1);
    for (int i : arr) {
        System.out.print(i+" ");
    }
   }
   static void ms(int [] arr,int low,int high){
    if(low>=high){
        return;
    }
    int mid=(low+high)/2;
    ms(arr, low, mid);
    // First Half
    ms(arr, mid+1, high);
    // Second Half
    merge(arr,low,mid,high);
    // Merging the Two Arrays 
   }
   static void merge(int []arr,int low,int mid,int high){
    ArrayList <Integer> a = new ArrayList<Integer>();
    int left = low;
    int right=mid+1;
    // Adding Elements from both divided arrays util the condition satisifies if not satifies then 
    // go out the loop 
    while(left<=mid && right<=high){
        if(arr[left]<=arr[right]){
             a.add(arr[left]);
             left++;
        }
        else{
           a.add(arr[right]);
           right++;
        }
    }
    // Adding Remaining Elements at first Half
    while(left<=mid){
        a.add(arr[left]);
        left++;
    }
    // Adding Remaining Elements at Second Half
    while(right<=high){
        a.add(arr[right]);
        right++;
    }
    // updating the elements in the Original Array
    for(int i=low;i<=high;i++){
         arr[i]=a.get(i-low);
    }
   }
}