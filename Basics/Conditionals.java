public class Conditionals{
    public static void main(String[] args) {
        // if-else statements
        // if (boolean expr){
        //     body
        // }else{
        //     body
        // }
        int salary =25400;
        if(salary>20000){
            salary+=2000;
        }else{
            salary+=1000;
        }
        System.out.println(salary);
        int a=20000;
        // multiple if-else statements
        // first statement is true then execute the first statement
        // if (boolean expr){
        //     body
        // }else if(body exxpr){
        //    body
        // }else{
        //     body
        // }
        if(a>10000){
            a+=10;
        }else if(a>15000){
            a+=15;
        }else{
            a+=5;
        }
        System.out.println(a);
    }
}