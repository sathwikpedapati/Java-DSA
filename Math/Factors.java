import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        fact(n);
        System.out.println();
        System.out.println("Counting Factors "+ count(n));
        System.out.println("Sum of Factors "+sum(n));
    }
    static void fact(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
    static int count(int num){
        int c=0;
        for(int i=1;i<=num;i++){
           if(num%i==0){
            c++;
           }
        }
        return c;
    }
    static int sum(int num){
        int s=1;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                s+=i;
            }
        }
        return s;
    }
}
