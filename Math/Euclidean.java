import java.util.Scanner;

public class Euclidean{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        result(a, b);   
    }
    static void result(int m,int n){
        while(n!=0){
            int temp=m;
            m=n;
            n=temp%n;
        }
        System.out.println("GCD "+m);
    }
}