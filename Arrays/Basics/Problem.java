package Arrays.Basics;

import java.util.Arrays;

// for calculating the second max or second min then Every element != max or min and Every Element compare with secondmax or secondmin(nums[i]>secondmax or nums[i]<secondmin)
public class Problem {
    public static void main(String[] args) {
        int [] a={5,4,3,2,1,0};
        int [] b={-1,2,-4,-8,-10,98,89};
        System.out.println(average(a));
        System.out.println(maximum(a));
        System.out.println(minimum(a));
        counting(a);
        indices(a);
        replacing(b);
        System.out.println();
        System.out.println(searching(a, 4));
        copying(b);
        secondlargest(a);
        secondsmallest(a);
    }
    static int average(int []nums){
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        int length=nums.length;
        return s/length;
    }
    static int maximum(int []nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
        }
        return max;
    }
    static int minimum(int []nums){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
        }
        return min;
    }
    static void counting(int[]nums){
        int o=0;
        int e=0;
        for(int n:nums){
            if(n%2==0) {
                System.out.println("Even :"+n);
                e++;
            }
            else{ 
                System.out.println("Odd :"+n);
                o++;
            }
        }
        System.out.println("Even Count: "+e+" "+"Odd Count: "+o);
    }
    static void indices(int []nums){
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                System.out.println("E: "+i);
            }else{
                System.out.println("O: "+i);
            }
        }
    }
    static void replacing(int []a){
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                a[i]=0;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static int searching(int []nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return i;
        }
        return -1;
    }
    static void copying(int []nums){
        int [] n =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            n[i]=nums[i];
        }
        System.out.println(Arrays.toString(n));
    }
    static void secondlargest(int[]nums){
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && secondmax<nums[i]){
                secondmax=nums[i];
            }
        }
        System.out.println("max "+max);
        System.out.println("second max "+secondmax);
    }
    static void secondsmallest(int []nums){
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;    
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i], min);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=min && nums[i]<secondmin){
                secondmin=nums[i];
            }
        }
        System.out.println("min "+ min);
        System.out.println("second min " +secondmin);
    }
}
