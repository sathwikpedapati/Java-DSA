import java.util.Scanner;
// ncr =(n!)/(r!*(n-r)!)
// npr =(n!)/(n-r)!
public class NCRandNPr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int c=cf(n)/((cf(r))*cf(n-r));
        int p=cf(n)/(cf(n-r));
        System.out.println("Combination "+c);
        System.out.println("Permutation "+p);
    }
    static int cf(int f){
        int fact=1;
        for(int i=2;i<=f;i++){
            fact*=i;
        }
        return fact;
    }
}
