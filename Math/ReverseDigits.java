import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(method(n));
    }
    // O(log10N)
    // n-n/10-n/100-....-1
    // n/10**k=1
    // k=log10(n)
    static int method(int num){
        int r=0;
        while(num>0){
            int last =num%10;
            r=r*10+last;
            num=num/10;
        }
        return r;
    }
}
