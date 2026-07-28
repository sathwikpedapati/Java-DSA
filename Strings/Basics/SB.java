import java.util.Scanner;

public class SB{
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("sathwik");
       syntax(sb);
       // Default capacity is 16 Characters
       StringBuilder s = new StringBuilder();
       s.append("sathwik");
       Implement(s);
       // Mentioned the Capacity
       StringBuilder k=new StringBuilder(50);
       k.append("hello hi How Are You are you fine what about you?");
       Implement(k);
       // Direct String Builder Syntax
       StringBuilder o=new StringBuilder("Sathwik Pedapati");
       Implement(o);
       //mentioning the CharSquence
       CharSequence cs="Pedapati";
       StringBuilder hi=new StringBuilder(cs);
       hi.append("Sathwik");
       Implement(hi);
       StringBuilder i = new StringBuilder("Sathwi");
       Methods(i);
       Scanner sc = new Scanner(System.in);
       String str=sc.nextLine();
       StringBuilder yup = new StringBuilder(str);
       System.out.println(Palindrome(yup));
    }
    static void syntax(StringBuilder s){
        System.out.println(s);
    }
    static void Implement(StringBuilder str){
        System.out.println(str);
    }
    static void Methods(StringBuilder k){
        // Append - Append the string char at last
        k.append('k');
        k.append(" Pedapati");
        System.out.println(k);
        // Reverse - Reversing the Characters in the String
        k.reverse();
        System.out.println(k);
        // Length - length of the String
        System.out.println(k.length());
        // Capacity Of String
        System.out.println(k.capacity());
        // Insert the String -insert(position,String)
        k.insert(0, "Sri");
        System.out.println(k);
        // Replace the String (start,end+1,string)
        k.replace(3, 11, " Pedapati");
        int l= k.length();
        k.replace(12, l, " Sathwik");
        System.out.println(k);
        // Char At that position
        char chAtl =k.charAt(l-1);
        char chAtF=k.charAt(0);
        System.out.println(chAtl);
        System.out.println(chAtF);
        // SetCharacter at that positon
        k.setCharAt(0, 'C');
        System.out.println(k);
        // Delete the staring based on the postions
        k.delete(0, 4);
        System.out.println(k);
        // delete Character at the position
        k.deleteCharAt(k.length()-1);
        System.out.println(k);
        // Conversion String Builder to String
        System.out.println(k.toString());

    }
    static String Palindrome(StringBuilder m){
        if(m==m.reverse()){
            return "Palindrome";
        }else{
            return "Not a Palindrome";
        }
    }
}