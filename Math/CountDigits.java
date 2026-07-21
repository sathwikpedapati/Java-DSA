import java.util.Scanner;
public class CountDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(method(n));
        System.out.println(other(n));
    }
    // O(log10N)
    // n-n/10-n/100-....-1
    // n/10**k=1
    // k=log10(n)
    static int method (int num){
        int c=0;
        while(num>0){
          c++;
          num=num/10;
        }
        return c;
    }
    // O(1)
    static int other(int num){
        int ans=(int)Math.log10(num)+1;
        return ans;
    }

}