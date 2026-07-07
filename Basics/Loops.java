public class Loops {
    public static void main(String[] args) {
        // for(intialisation;condition;increment or decrement){
        //     body
        // }
        System.out.println("------for loop-------");
        for(int n=1;n<=5;n+=1){
            System.out.println(n);
        }
        // while(condition){
        //     increment / decrement
        // }
        System.out.println("------ while loop -------");
        int i=1;
        while(i<=5){
            System.out.println(i);
            i+=1;
        }
        // do{
        //     //body
        //     // increment or decrement
        // }while(condition);
        System.out.println("------do while loop --------");
        int n=1;
        do{
            System.out.println(n);
            n++;
        }while(n<=5);
    }
}
