import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollno =input.nextInt();
        float marks= input.nextFloat();
        String name=input.next();
        System.out.printf("%d %.2f %s",rollno,marks,name);
    }
}
