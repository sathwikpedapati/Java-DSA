import java.util.Scanner;

public class Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        method(n);
    }
    static void method(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}