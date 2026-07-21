import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(method(n));
    }
    static boolean method(int num){
        int c=0;
        int t1=num;
        int t2=num;
        int res=0;
        // Counting Digits
        while(t1>0){
           c++;
           t1/=10;
        }
        // Summation
        // O(log10N)
        // n-n/10-n/100-....-1
        // n/10**k=1
        // k=log10(n)
        while(t2>0){
            int last=t2%10;
            res=res+(int)(Math.pow(last, c));
            t2/=10;
        }
        return res==num;
    }
}
