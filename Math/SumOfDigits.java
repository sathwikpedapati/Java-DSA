import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Addition(n));
    }
    static int Addition(int num){
        int sum=0;
        while(num>0){
            sum=sum+(num%10);
            num=num/10;
        }
        return sum;
    }
}
