import java.util.Scanner;

public class LargestDigit{
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     result(n);
   }
   static void result(int num){
     int m=num%10;
     while(num>0){
        if((num%10)>m){
            m=num%10;
        }
        num/=10;
     }
     System.out.println("Max of these Digits "+m);
   }
}