import java.util.*;
public class Simple{
    public static void main(String[] args) {
        sum(); // Calling the Function
        int ans=sum2();  // the result stored in the ans variable 
        System.out.println("result"+ " "+ans);
        greetings(); // return the statement in greetings then printed 
    }
    static void sum(){
        // static - object class
        // void,int and any datatype - return value function 
        // sum - function name
    Scanner input = new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    System.out.println("result"+ " "+a+b);
    }
    static int sum2(){
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int b=input.nextInt();
        return a+b;
        // System.out.print(a+b); after the return statement any statements wont be execute 
    }
    static void greetings(){
        System.out.println("Hello My name is Sathwik"); // Compuslory the return statement mentioned 
    }
}