import java.util.Scanner;

public class PrintingArmstrongs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first =sc.nextInt();
        int last=sc.nextInt();
        for(int i=first;i<=last;i++){
            if(method(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean method(int num){
        int t1=num;
        int t2=num;
        int res=0;
        int c=0;
        while(t1>0){
          c++;
          t1/=10;
        }
        while(t2>0){
            int l=t2%10;
            res=res+(int)(Math.pow(l, c));
            t2/=10;
        }
        return num==res;
    }
}
