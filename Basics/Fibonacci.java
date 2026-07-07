public class Fibonacci {
    public static void main(String[] args) {
        int n=7;
        int a=0;
        int b=1;
        int count=2;
        System.out.println("----fibonacci series ------");
        for (int i =count;i<=n;i++){
           int temp=b;
           b=b+a;
           a=temp;
           count++;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(count);
    }
}
