import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        method(n);
    }
    static void method(int num){
        for(int i=1;i<=num;i++){
            for(int j=num;j>=i;j--){
              System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}