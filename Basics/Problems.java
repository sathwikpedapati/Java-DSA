import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
     int n =  input.nextInt();
     // Even or Odd
     if(n%2==0){
        System.out.println("even");
     }else{
       System.out.println("Odd");
     }
    //  // Take An Input and display the input
     String name= input.next();
     System.out.println(name);
    //  // Calculate the simple interest =(p*t*r)/100
     int p =input.nextInt();
     int t=input.nextInt();
     int r=input.nextInt();
     int si=(p*t*r)/100;
     System.out.println("Simple Interest"+" "+si);

     // Indian rupees --> Dollars
     int rupees=input.nextInt();
     System.out.printf("Dollars"+" "+"%.2f",(rupees*0.011));
     
     // largest of two
     int a=9;
     int b=10;
     if(a>b){
        System.out.println(a);
     }else{
        System.out.println(b);
     }
     
    }
}
