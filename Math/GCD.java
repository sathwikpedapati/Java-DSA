import java.util.Scanner;
// loop goes upto minimum of two numbers
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD"+" "+HCF(a, b));
    }
    static int HCF(int m,int n){
        int k=Math.min(m, n);
        int gcd=1;
        for (int i=2;i<=k;i++){
            if(m%i==0 && n%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}
