package Arrays.Basics;

import java.util.Arrays;

// for calculating the second max or second min then Every element != max or min and Every Element compare with secondmax or secondmin(nums[i]>secondmax or nums[i]<secondmin)
public class Problem {
    public static void main(String[] args) {
        int [] a={5,4,3,2,1,5,0,-2};
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
        sloptimal(a);
        ssoptimal(a);
        Bruteforce(a);
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
        // Time Complexity is O(N+N)
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i], max);
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]>secondmax && nums[j]!=max){
                secondmax=nums[j];
            }
        }
        System.out.println("maximum "+max);
        System.out.println("second maximum "+secondmax);
    }
    static void secondsmallest(int []nums){
        // Time Complexity is O(N+N) 
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;    
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i], min);
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]<secondmin && nums[j]!=min){
                secondmin=nums[j];
            }
        }
        System.out.println("min "+ min);
        System.out.println("second min " +secondmin);
    }
    static void sloptimal(int [] nums){
        // Time Complexity - Single Loop --> O(n)
        int max=nums[0];
        int secondmax=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                secondmax=max;
                max=nums[i];
            }
            else if(nums[i]<max && nums[i]>secondmax){
                secondmax=nums[i];
            }
        }
        System.out.println("Optimal Maximum "+max);
        System.out.println("Optimal Second Maximum "+secondmax);
    }
    static void ssoptimal(int [] nums){
        int min= nums[0];
        int secondmin=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                secondmin=min;
                min=nums[i];
            }
            else if(nums[i]>min && nums[i]<secondmin){
                secondmin=nums[i];
            }
        }
        System.out.println("Optimal Minimum "+min);
        System.out.println("Optimal Second Minimum"+secondmin);
    }
    static void Bruteforce(int []nums){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int largest =nums[nums.length-1];
        int secondlargest=Integer.MIN_VALUE;
        int smallest =nums[0];
        int secondsmallest=Integer.MAX_VALUE;
        System.out.println("largest" + largest);
        //  Both the Time Complexity is O(NlogN)
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=largest){
                secondlargest=nums[i];
                break;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=smallest){
               secondsmallest=nums[i];
               break;
            }
        }
        System.out.println("Maximum in the Array "+largest);
        System.out.println("Second Maximum in the Array "+secondlargest);
        System.out.println("Minimum in the Array "+smallest);
        System.out.println("Second Minimum in the Array "+secondsmallest);
    }
}
