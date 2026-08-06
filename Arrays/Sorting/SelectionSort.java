package Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] nums={13,1,90,6,5,45,1};
        sorting(nums); 
    }
    static void sorting(int [] n){
        for(int i=0;i<n.length;i++){
            // suppose the min value is assigned at i position
            int m=i;
            for(int j=i;j<n.length;j++){
                // fetch the min value index
                if(n[j]<n[m]) m=j;
            }
            // Swap (a[min],a[i])
            int temp=n[m];
            n[m]=n[i];
            n[i]=temp;
        }
        System.out.println(Arrays.toString(n));
    }
}
