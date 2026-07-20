import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(method(n));
    }
    static boolean method(int num){
      int r=0;
      int temp=num;
      while(temp>0){
        int last =temp%10;
        r=r*10+last;
        temp=temp/10;
      }
      return num==r;
    }
}
