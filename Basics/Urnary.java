public class Urnary {
    public static void main(String[] args) {
        // Prefix --> first change it then use it
        // postfix --> first use the current value then update it 

        // prefix - firstly update
        // postfix - firstly use 
        int a=10;
        System.out.println("prefix"+" "+(++a));  // a is change to 11
        System.out.println("postfix"+" "+(a++)); // use 11 then update it
      
        int b= 9;
        System.out.println("Prefix"+" "+ (--b));
        System.out.println("Postfix"+" "+(b--));


        // Example
        int x = 5;
        int y = x++ + ++x + x-- + --x;
        System.out.println(y);
        System.out.print(x);
        
    }
}
