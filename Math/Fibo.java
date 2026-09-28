import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fib(n);
    }

    static void fib(int num) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;
        }

        System.out.println();
    }
}