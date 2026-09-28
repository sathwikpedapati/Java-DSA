import java.util.Scanner;

public class Pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        // Time complexity --> O(n/2) -> O(n)
        // Space Complexity --> using entire stack so that O(n)
        System.out.println(method(0, s));
        // Time complexity --> O(n/2) -> O(n)
        // Space Complexity --> using entire stack so that O(n)
        int left=0;
        int right=s.length()-1;
        System.out.println(another(s, left, right));

    }
    static boolean method(int i,String s){
        // from 0 to half of the string 
        // move 0 index to half of the string 
        // if not equals then return the false 
        // if goes good then increase the index ++
        // i >=half then return the true 
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return method(i+1, s);
    }
    static boolean another(String s,int l,int r){
        // from left  to right in the string
        // if not equals then return the false
        // if equals increase the left and decrease the right 
        // if l>r return the true
        if(l>r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;
        return another( s,l+1,r-1);
    }

}
