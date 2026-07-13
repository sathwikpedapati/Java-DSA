import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        method(n);
    }
    static void method(int num){
        for(int i=num;i>=1;i--){
            for(int j=i;j<=num;j++){
                System.out.print("  ");
            }
            for(int j=(2*i)-1;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
