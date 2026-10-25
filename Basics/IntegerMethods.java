public class IntegerMethods {
    public static void main(String [] args){
        methods();
    }
    static void methods(){
        // Converting String into primitive int
        String s="12389";
        System.out.println(Integer.parseInt(s));
        // converting String into Integer Object
        System.out.println(Integer.valueOf(s));
        // Converting int into String
        int p=9090;
        System.out.println(Integer.toString(p));
        // Converting Integer to Binary String
        int dec=10;
        System.out.println(Integer.toBinaryString(dec));
        // convert integer with base like binary or hexadecimal;
        // mentioning the radix like bin-2 and oct-8 and hexa-16
        System.out.println(Integer.toString(dec,8));
        // return max and min of two integers
        System.out.println(Integer.max(9,8));
        System.out.println(Integer.min(9,8));
        // reverese the bits
        System.out.println(Integer.reverse(9));
        // return the Integer Max and Min Value
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        // Integer ---> bitcount
        System.out.println(Integer.bitCount(9));
        // Compare Two Integers
        System.out.println(Integer.compare(2,8));
        System.out.println(Integer.compare(8,2));
        System.out.println(Integer.compare(2,2));

        // Problem
        int a=123456;
        String b= Integer.toString(a);
        for(int i=0;i<b.length();i++){
            //  return character to digit
            int digit =b.charAt(i)-'0';
            System.out.print(digit+" ");
        }

    }
}
