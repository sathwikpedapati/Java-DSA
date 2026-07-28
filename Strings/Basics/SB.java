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

    }
    static void syntax(StringBuilder s){
        System.out.println(s);
    }
    static void Implement(StringBuilder str){
        System.out.println(str);
    }
}