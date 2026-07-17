public class Basicstuff{
public static void main(String[] args) {
    // Order Of Time Complexities
    // O(1) 
    // O(logn)
    // O(Sqrt(N))
    // O(N)
    // O(NlogN)
    // O(N Square)
    // O(N Cube)
    // O(2 Power N)
    // O(N factorial N)
    int [] arr ={1,2,3,4,5};
    int target=1;
    Best(arr, target);
    target=5;
    Worst(arr, target);
    target=3;
    Average(arr, target);
    Example(7);
    // Space Complexity - Input space + Auxiliary Space
    int n =9; // Constant then -- O(1)
    int[]ne = new int [n]; // New Space so that --- O(N)
}
static void Best(int []nums,int target){
    // Best Case / LowerBound  /Omega
    // element found at first place so that It Can be represented by O(1) 
    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            System.out.println(i);
            break;
        }
    }
}
static void Worst(int[] nums ,int target){
    // Worst Case/ Upper Bound/ Big Oh Notationn
    // If I get the Element at last Postion so it can be represented by O(N)
    for(int i=0;i<nums.length;i++){
       if(nums[i]==target){
        System.out.println(i);
        break;
       }
    }
}
static void Average(int []nums,int target){
    // Average Case / Theta 
    //  (Best + Worst) /2
    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            System.out.println(i);
            break;
        }
    }
}
static void Example(int n){
     int c=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            c++;
        }
    }
    // i=0 j=0,.. n
    // i=1 j=0,...n
    // ..
    // ..
    // i=n j=0,...n
    // n*(n+n+n)
    // n*n 
    // Clearly Says that when give the number it doubling so that n*n
    // So that It Time Complexity May be n*n
    System.out.println(c);
    // 1+2+3+4....+n
    // So that (N*(N+1))/2
    // result N*N
    int count =0;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            count++;
        }
    }
    System.out.println(count);
}
}