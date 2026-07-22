import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i=sc.nextLine();
        String j=sc.nextLine();
        plus(i, j);
        method(i, j);
        combination(j, 10);
    }
    static void plus(String m , String n){
        String k=m+n;
        System.out.println(k);
    }
    static void method(String m,String n){
        // m is combined with n
        String k=m.concat(n);
        // n is combined with m
        String l=n.concat(m);
        // Combination of 4 strings
        System.out.println(m.concat(n).concat(k).concat(l));
        System.out.println(k);
        System.out.println(l);
    }
    static void combination(String s,int k){
        // string have more size than int
        String z=s+k;
        // int l=s+k; shows an error 
        System.out.println(z);
    }
}