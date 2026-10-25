import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        method(n);
    }
    static void method(int num){
        boolean iscomposite=false;
        if(num<=1){
            System.out.println("Either Composite or Prime");
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    iscomposite=true;
                    break;
                }
            }
        }
        if(iscomposite){
            System.out.println(num+" is Composite number");
        }else{
            System.out.println(num+" is not Composite number");
        }
    }
}
