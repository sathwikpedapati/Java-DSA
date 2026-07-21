public class MultiDimensional{
    public static void main(String args[]){
        int [][]n={{1,2,3},{4,5,6}};
         len(n);
         access(n);
         change(n);
         traversing(n);
    }
    static void len(int [][]nums){
        System.out.println("Row Size " +nums.length);
        System.out.println("Column Size "+nums[0].length);
    }
    static void access(int [][]nums){
        System.out.println(nums[0][0]);
    }
    static void change(int [][]nums){
        nums[0][0]=9;
        System.out.println(nums[0][0]);
    }
    static void traversing(int [][]nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
        }
        System.out.println();
        for(int []num:nums){  // Each Row
            for(int n:num){   // Each Element in that row
                System.out.print(n+" ");
            }
        }
    }
}