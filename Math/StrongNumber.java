import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(check(n)){
            System.out.println(n+"is Strong number");
        }else{
            System.out.println(n+" is not a Strong number");
        }
    }
    static boolean check(int num){
        int sum=0;
        int temp=num;
        while(temp>0){
            int fact=1;
            int last=temp%10;
            for(int i=1;i<=last;i++){
                fact*=i;
            }
            sum+=fact;
            temp/=10;
        }
        return num==sum;
    }
}
