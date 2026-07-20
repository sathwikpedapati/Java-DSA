import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(method(n));
    }
    static int method(int num){
        int prod=1;
        while(num>0){
            prod*=(num%10);
            num=num/10;
        }
        return prod;
    }
}
