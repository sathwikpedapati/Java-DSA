import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(check(n)){
            System.out.println("Harshad number");
        }else{
            System.out.println("Not a Harshad Number");
        }
    }
    static boolean check(int num){
        int s=0;
        int temp=num;
        while(temp>0){
           s+=(temp%10);
           temp/=10; 
        }
        return num%s==0;
    }
}
