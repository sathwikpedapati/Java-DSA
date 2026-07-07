import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a= input.nextInt();
    int b= input.nextInt();
    System.out.println("Addition"+" "+(a+b));
    System.out.println("Subraction"+" "+(a-b));
    System.out.println("Multiplication"+" "+(a*b));
    System.out.println("Divison"+" "+(a/b));
    System.out.println("Remainder"+" "+(a%b));  
    }
}
