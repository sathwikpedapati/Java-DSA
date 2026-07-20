import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Normal(n);
        sqrt(n);
    }
    static void Normal(int num){
        if(num<=1){
            System.out.println("Either prime or composite");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    System.out.println(num+" is not prime number");
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num+ "is Prime number");
            }
        }
}
static void sqrt(int num){
        if(num<=1){
            System.out.println("Either prime or composite");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<=(int)Math.sqrt(num);i++){
                if(num%i==0){
                    System.out.println(num+" is not Prime number");
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num +" is Prime number");
            }
        }
}
}