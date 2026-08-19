import java.util.Scanner;
import java.util.*;
public class Basics{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         recursion(n);
         System.out.println("-------------");
         normal(n);
         System.out.println("-------------");
         printName(5, "sathwik");
         System.out.println("-------------");
         print1toN(1, 5);
         System.out.println("-------------");
         System.out.print("sum"+" ");
         System.out.println(sum(5));
         System.out.println("-------------");
         System.out.println("factorial"+" "+fact(5));
         System.out.println("----------------");
         int [] nums={1,2,3,4,5};
         reverse(nums, 0, nums.length-1);
         System.out.println(Arrays.toString(nums));
    }
    static void normal(int n){
        while(n>0){
            System.out.println(n);
            n--;
        }
    }
    static void recursion(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        recursion(n-1);
    }
    static void printName(int n,String naam){
        if(n==0){
            return;
        }
        System.out.println(naam);
        printName(n-1, naam);
    }
    static void print1toN(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print1toN(i+1, n);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    static void reverse(int [] nums,int start,int end){

        if(start>=end){
            return ;
        }
        int temp =nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        reverse(nums, start+1, end-1);
    }

}