import java.util.Scanner;
// Parameters - Variables are defined in the method Declaration 
// Arguments - Actual values are passed into the function
public class Parameters {
    static String greet(String name){ // Parameters
    return "Hello"+" "+name;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String n = sc.nextLine();
      String ans=greet(n); // Arguments 
      System.out.println(ans);
    }
}
