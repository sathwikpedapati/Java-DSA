import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        fact(n);
        other(n);
        System.out.println();
        System.out.println("Counting Factors "+ count(n));
        System.out.println("Sum of Factors "+sum(n));
    }
    // Time Complexity is O(N)
    static void fact(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
    // i is dividing n and n/i is divisor
    // Time Complexity is O(Sqrt(N))
    // they are in unorder so that arrange in the ascending order
    static void other(int num){
        ArrayList <Integer> a =new ArrayList<>();
        for(int i=1;i<=(int)Math.sqrt(num);i++){
            if(num%i==0){
                a.add(i);
                if(i!=num/i){
                 a.add(num/i);
                }
            }
        }
        System.out.println(a);
    }
    // Time Complexity is O(N)
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
