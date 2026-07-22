import java.util.Scanner;

public class Sieveoferatosthenes {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         method(n);
    }
    static void method(int num){
        int c=0;
        boolean [] isprime=new boolean[num+1];
        isprime[0]=false;
        isprime[1]=false;
        // Time Complexity is O(n)
        for(int i=2;i<=num;i++){
            isprime[i]=true;
        }
        // It is Mathematically Complicated so that its time complexity is O(n*log(log(n)))
        for(int i=2;i<=num;i++){
            if(isprime[i]){
               System.out.println(i);
               c++;
               for(int j=i*i;j<=num;j=j+i){
                  isprime[j]=false;
               }
            }
        }
        // O(n)+O(n*log(log(n)))
        //O(n*log(log(n))) is the Time Complexity
        System.out.println("Count Primes "+c);
    }
}
