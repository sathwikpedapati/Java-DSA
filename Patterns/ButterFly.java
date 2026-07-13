import java.util.Scanner;
public class ButterFly {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n=sc.nextInt();
        method(n);
    }
    static void method(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=((2*num)-(2*i));j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=num;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=((2*num)-(2*i));j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
