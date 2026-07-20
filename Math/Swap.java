import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        change(m, n);
    }
    static void change(int a,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
