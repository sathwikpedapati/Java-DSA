import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // VarArgs is method to implement the group of Arguments in Single Argument
        // ...v is group of Arguments
        display("sathwik","sowshik","siddhik","rudhvik","vanshi");
    }
    static void display(String ...v){
        System.out.println(v.length);
        System.out.print(Arrays.toString(v));
    }
}
