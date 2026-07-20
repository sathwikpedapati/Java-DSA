import java.util.Scanner;

public class CheckDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k =sc.nextInt();
        check(k);
    }
    static void check(int num){
        if(num%2==0){
            System.out.println("Divisible by 2");
        }
        else if(num%3==0){
          System.out.println("Divisible by 3");
        }
        else if(num%5==0){
            System.out.println("Divisble by 5");
        }
        else if(num%9==0){
            System.out.println("Divisble by 9");
        }
        else if(num%10==0){
            System.out.println("Divisble by 10");
        }else{
            System.out.println("Nothing");
        }
    }
}
