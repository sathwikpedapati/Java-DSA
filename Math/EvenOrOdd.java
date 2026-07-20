import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
    static void check(int num){
        if(num%2==0){
            System.out.println(num+" is Even number");
        }else{
            System.out.println(num+" is Odd Number");
        }
    }
}
