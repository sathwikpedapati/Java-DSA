import java.util.Scanner;

public class ReverseAlphaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        method(n);
    }
    static void method(int num){
        char ch ='A';
        for(int i=num;i>=1;i--){
            for(int j=i;j<=num;j++){
              System.out.print((char)(ch+(j-1))+" ");
            }
            System.out.println();
        }
    }
}
