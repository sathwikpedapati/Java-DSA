import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        result(n);
    }
    static void result(int num){
        int Even=0;
        int Odd=0;
        while(num>0){
            if((num%10)%2==0){
                Even++;
            }else{
                Odd++;
            }
            num/=10;
        }
        System.out.println("Even Count: "+Even+" "+"Odd Count: "+Odd);
    }
}
