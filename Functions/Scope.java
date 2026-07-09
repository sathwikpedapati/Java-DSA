// Block scope means that variables are declared (intialised) inside the block then can be accessed inside the block when i used to access outside block it shows the error 
// Method Scope means that variables are accessed within the method where they are intialised and updated
// Loop Scope means that variables are accessed and updated and other operations in that loop
public class Scope {
    public static void main(String[] args) {
        int a=100; // method Scope
        {
            a=89;
            System.out.println("Block scope "+ a);
            int b=90;
            System.out.println(b);
        }
        // a is update to when i change
        a=a+10;
        // System.out.println(b); //it shows the error because it is outside the block
        change(a);
        System.out.println("Outside Block and value may be or may not be updated /Method Scope "+a);
        for(int i=0;i<=9;i++){
            System.out.println(i);// I is accessed inside the loop only 
        }
        // System.out.println(i); // When i used to access the i then it shows the error because the i intialised inside the loop
    }
    static void change(int num){
        System.out.println(num);
    }
}
