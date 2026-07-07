public class Ternerary {
    public static void main(String[] args) {
        // cond ? true : false
        int a=7,b=8;
        int maxoftwo=a>b?a:b;
        System.out.println("Max of two" +" "+maxoftwo);
        int c=10;
        int maxofthree=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("Max of three"+" "+maxofthree);
    }
}
