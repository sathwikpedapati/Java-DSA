import java.util.Scanner;
// using the formula a*b = hcf*lcm
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(method(a, b));
    }
    static int method(int m,int n){
        int k =Math.min(m, n);
        int gcd=1;
        for(int i=2;i<=k;i++){
            if(m%i==0 && n%i==0){
                gcd=i;
            }
        }
        return (m*n)/gcd;
    }
}
