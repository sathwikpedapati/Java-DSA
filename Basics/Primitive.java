public class Primitive{
    public static void main(String args[]){
        int a=19;
        float b=12.4f;
        float u=1223.6789f;
        boolean c=true;
        char d='a';
        long e=100L;
        byte f=10;
        short g=1000;
        System.out.printf("%d %f %b %c %d %d %d", a, b, c, d, e,f,g); // Multiple Values Displaying Statement
        System.out.println(a); // Printing New Line Of Output
        System.out.print(b);   // Prints Same line of output
        System.out.print(" " + c);
        System.out.println();
        System.out.printf("%.1f",u); // Upto 1 decimal Places
        System.out.println();
        System.out.printf("%.2f",u); // Upto 2 decimal Places
        System.out.println();
        System.out.printf("Hello%nword"); // New Line Output

    }
}
