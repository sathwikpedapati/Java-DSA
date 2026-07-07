import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    // char op = input.next(); next or nextLine returns the string so that used charAt  method 
    char op = input.nextLine().charAt(0);
    int  m= input.nextInt();
    int  n= input.nextInt();
    if(op=='+'){
        System.out.println(m+n);
    }else if(op=='-'){
        System.out.println(m-n);
    }else if(op=='*'){
        System.out.println(m*n);
    }else{
        System.out.println(m/n);
    }

    }
}
