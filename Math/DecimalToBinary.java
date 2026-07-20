import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
       result(n);
    }
    static void result(int n){
       String res="";
       while(n>0){
        res=n%2+" "+res;
        n=n/2;
       }
       System.out.println(res);
    }
}
