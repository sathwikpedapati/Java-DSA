import java.util.Scanner;
// loop goes upto minimum of two numbers
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD"+" "+HCF(a, b));
        System.out.println("GCD"+" "+GCD(a, b));    
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
    // O()
    static int GCD(int m,int n){
        while(m>0 && n>0){
            if(m>n){
                m=m%n;
            }else{
                n=n%m;
            }
            
        }
        if(m==0) return n;
        else return m;
    }
}
