import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Fact(n));
    }
    static int Fact(int num){
        int f=1;
        for(int i=2;i<=num;i++){
            f*=i;
        }
        return f;
    }
}
