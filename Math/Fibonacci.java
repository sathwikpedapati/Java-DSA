import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
    }
    static void fib(int num){
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<=num;i++){
            int temp=a;
            a=b;
            b=temp+b;
            System.out.print(b+" ");
        }
        System.out.println();
        System.out.print(num+"th Fibonacci "+b);
    }
}
