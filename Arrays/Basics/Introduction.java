package Arrays.Basics;

public class Introduction {
    public static void main(String[] args) {
       // Normal Method
       int [] arr={1,2,3,4,5};
       // Using new Keyword
       int []a=new int[2];
       a[0]=99;
       a[1]=89;
       print(arr);
       // Printing last and first Element
       firstlast(arr);
       access(arr);
       access(a);
       change(arr);
       length(arr);
       length(a);
       // Another Approach with new keyword and adding elements
       int [] cars =new int[]{1,2,3,4,5};
       length(cars);
    }
    static void print(int [] nums){
        System.out.println(nums);
    }
    static void access(int []nums){
       System.out.println(nums[0]);
    }
    static void change(int []nums){
        nums[1]=90;
        System.out.println(nums[1]);
    }
    static void length(int []nums){
        System.out.println(nums.length);
    }
    static void firstlast(int []nums){
        System.out.println(nums[0]);
        System.out.println(nums[nums.length-1]);
    }
}
