import java.util.Scanner;
public class CountDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(method(n));
    }
    static int method (int num){
        int c=0;
        while(num>0){
          c++;
          num=num/10;
        }
        return c;
    }
}