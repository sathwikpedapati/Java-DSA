import java.util.Scanner;
// loop goes upto minimum of two numbers
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD"+" "+HCF(a, b));
        System.out.println("GCD"+" "+gcd(a, b));   
        System.out.println("GCD"+" "+other(a, b)); 
    }
    // O(min(a,b))
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
    // decreasing the number so that used log
    // Modulo Operation then O(log(min(a,b)))
     static int gcd(int m,int n){
        while(m>0 && n>0){
            if(m>n) m%=n;
            else n%=m;
        }
        if(m==0) return n;
        return m;
     }
    // Subraction GCD comparing higher number then subracting so that O(max(a,b))
    static int other(int a,int b){
      while(a>0 && b>0){
        if(a>b){
            a=a-b;
        }else{
            b=b-a;
        }
      }
      if(a==0) return b;
      return a;
    }
}
