import java.util.Scanner;

public class Intro{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String str=sc.nextLine();
      String l=sc.nextLine();
      len(str);
      changecase(str);
      location(str, 5);
      compare(str, str);
      // Adding Extra Space
      compare(str, str+" ");
      removespaces(l);
      iterate("90000");

    }
    static void len(String s){
        System.out.println(s.length());
    }
    static void changecase(String n){
        System.out.println(n.toLowerCase());
        System.out.println(n.toUpperCase());
    }
    static void location(String g,int l){
        System.out.println(g.charAt(l));
        // including white spaces searching the matched string then return the index
        System.out.println(g.indexOf("sa"));
    }
    static void compare(String m,String n){
        System.out.println(m==n);
        System.out.println(m.equals(n));
    }
    static void removespaces(String k){
        // Removing white spaces at beginning and ending
        System.out.println(k.trim());
    }
    static void iterate(String l){
        // suppose when string is number then print as it is so that we use char-'0'
        for(int i=0;i<l.length();i++){
            System.out.println(l.charAt(i)-'0');
        }
    }
}