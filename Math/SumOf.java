import java.util.Scanner;

public class SumOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Summation(a, b));
    }
    static int Summation(int first,int last){
        int s=0;
        for(int i=first;i<=last;i++){
            s+=i;
        }
        return s;
    }
}
