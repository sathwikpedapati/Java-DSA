import java.util.Scanner;

public class InvertedNumberTriangle {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      method(n);
   } 
   static void method(int num){
    for(int i=num;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
   }
}
