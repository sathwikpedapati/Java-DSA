public class Changing {
    public static void main(String[] args) {
        // Changing the value by the reference
        // arr is pointing towards [1,2,3,4,5,6]
        // nums is also pointing towards [1,2,3,4,5,6]
        // when i change the value through the nums it changes the whole object  nums[0]=99        
        // // so that object will change then result is [99,2,3,4,5,6]
        int [] arr={1,2,3,4,5,6};
        change(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void change(int []nums){
        nums[0]=99;
    }
}
