import java.util.Scanner;

public class Into {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        method(n);
    }
    static void method(int num){
        for(int i=1;i<=num-1;i++){
            for(int j=1;j<=i;j++){
                if(i==j){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
                // System.out.print(j+" ");
            }
            for(int j=num-1;j>=i;j--){
                  if(i==j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                // System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=num;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(i==j){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
                // System.out.print(j+" ");
            }
            for(int j=num-1;j>=i;j--){
                  if(i==j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                // System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
