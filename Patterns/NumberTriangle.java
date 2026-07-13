import java.util.Scanner;
public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        method(n);
        System.out.println("------------");
        othermethod(n);
        
    }
    static void method(int num){
     for(int i=1;i<=num;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
     }
    }
    static void othermethod(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
     }
}
