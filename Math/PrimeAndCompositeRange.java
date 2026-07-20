import java.util.Scanner;

public class PrimeAndCompositeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first=sc.nextInt();
        int last=sc.nextInt();
        for(int i=first;i<=last;i++){
            check(i);
        }
    }
    static void check(int num){
       if(num<=1){
        System.out.println( num+" Either Prime Or Composite");
       }
       else{
         boolean cp=false;
         for(int i=2;i<num;i++){
            if(num%i==0){
                cp=true;
                System.out.println(num+" Composite");
                break;
            }
         }
         if(!cp){
            System.out.println(num +" Prime");
         }
       }
    }
}
