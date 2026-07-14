public class DifferentTriangle {
    public static void main(String[] args) {
        method(4);
    }
    static void method(int num){
        for(int i=1;i<=num;i++){
            for(int j=i;j<num;j++){
                System.out.print("  ");
            }
            int breakpoint =(2*i-1)/2;
            char ch ='A';
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(ch+" ");
               if(j<=breakpoint) ch++;
               else ch--;
            }
            System.out.println();
        }
    }
}
