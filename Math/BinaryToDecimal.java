import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int b=sc.nextInt();
        result(b);
    }
    static void result(int bin){
        int val=0;
        int p=0;
        while(bin>0){
            int last=bin%10;
            val=val+last*((int)(Math.pow(2, p)));
            bin/=10;
            p++;
        }
        System.out.println(val);
    }
}
