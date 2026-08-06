package Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] nums={13,1,90,6,5,45,1};
        sorting(nums); 
    }
    static void sorting(int [] n){
        for(int i=0;i<n.length;i++){
            int m=i;
            for(int j=i;j<n.length;j++){
                if(n[j]<n[m]) m=j;
            }
            int temp=n[m];
            n[m]=n[i];
            n[i]=temp;
        }
        System.out.println(Arrays.toString(n));
    }
}
