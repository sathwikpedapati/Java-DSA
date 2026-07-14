import java.util.Scanner;

public class ConcentrixSquare {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         method(n);
    }
    static void method(int num){
        for(int i=num;i>=1;i--){
            for(int j=num;j>1;j--){
               if(i>j){
                System.out.print(i+" ");
               }else{
                System.out.print(j+" ");
               }
            }
            for(int j=1;j<=num;j++){
               if(i>j){
                System.out.print(i+" ");
               }else{
                System.out.print(j+" ");
               }
            }
            System.out.println();
        }
        for(int i=2;i<=num;i++){
            for(int j=num;j>1;j--){
               if(i>j){
                System.out.print(i+" ");
               }else{
                System.out.print(j+" ");
               }
            }
            for(int j=1;j<=num;j++){
               if(i>j){
                System.out.print(i+" ");
               }else{
                System.out.print(j+" ");
               }
            }
            System.out.println();
        }
    }
}
