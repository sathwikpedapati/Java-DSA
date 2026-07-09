public class Shadowing {
    static int x=90; // Shadowing the Variable Overall the class use the x variable or say class variable
    public static void main(String[] args) {
        System.out.println(x);
        int x=78; // Shadowing the x variable or local variable
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
