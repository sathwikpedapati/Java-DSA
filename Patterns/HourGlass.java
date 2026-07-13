import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       method(n);
    }
    static void method(int num){
        for(int i=1;i<=num;i++){
            for(int j=num;j>=i;j--){
                System.out.print("*"+" ");
            }
            for(int j=2;j<(2*i);j++){
                System.out.print("  ");
            }
            for(int j=i;j<=num;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=num;i>=1;i--){
            for(int j=num;j>=i;j--){
                System.out.print("*"+" ");
            }
            for(int j=2;j<(2*i);j++){
                System.out.print("  ");
            }
            for(int j=i;j<=num;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
