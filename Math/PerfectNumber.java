import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if(check(n)){
            System.out.println(n+"is a Perfect Number");
        }else{
            System.out.println(n+" is not a perfect number");
        }
    }
    static boolean check(int num){
        int sum=1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        return num==sum;
    }
}
