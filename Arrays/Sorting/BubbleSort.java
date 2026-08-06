package Arrays.Sorting;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int [] nums={98,78,90,67,156,56};
        sorting(nums);  
    }
    static void sorting(int []n){
            for(int i=n.length-1;i>=0;i--){
                for(int j=0;j<=i-1;j++){
                    if(n[j]>n[j+1]){
                        int temp=n[j];
                        n[j]=n[j+1];
                        n[j+1]=temp;
                    }
                }
            }
        System.out.println(Arrays.toString(n));
        System.out.println("-----------------------");
        for(int i=0;i<=n.length-2;i++){
            for(int j=0;j<n.length-i-1;j++){
                if(n[j]>n[j+1]){
                    int temp =n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
         System.out.println(Arrays.toString(n));
    }
}
