import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     method(n);        
    }
    static void method(int num){
        for(int i=1;i<=num;i++){
            for(int j=i;j<num;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
