public class Special {
    public static void main(String[] args) {
        String k="It\'s ok";
        String j="Hello \"Sathwik\" Raju";
        String l="Hello \\Sathwik\\ Raju";
        Escape(l);
        Escape(j);
        Escape(k);
        String p="python";
        String q="java";
        System.out.println("python\njava");
        Specialise(p, q);
    }
    // \ is backslash is escaping character
    static void Escape(String s){
       System.out.println(s);
    }
    // Special Characters
    static void Specialise(String i,String j){
        // Mention in the Double Quotes
        // New Line
        System.out.println(i+"\n"+j);
        // BackSpace means Removing last character
        System.out.println(i+"\b"+j);
        // TabSpace
        System.out.println(i+"\t"+j);
    }
}
