public class Statements {
    public static void main(String[] args) {
        int day=9;
        switch (day) { // switch statement is to check the multiple if -else statements 
            case 1:
                System.out.println("monday");
                break; // if the statement is matches then stop the loop or execution 
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default: // if all the conditions are not matched then execute the default statement
                System.out.println("Not a Day");
                break;
        }
        System.out.println("-----break------");
        int i=1;
        for(;i<=5;i++){
            System.out.println("Iterating"+" "+i);
            if(i==2){
                System.out.println("breaking the loop at"+" "+i);
                break;
            }
        }
        System.out.println("-------continue-------");
        for(int j=1;j<=5;j++){
            System.out.println("Iterating"+" "+j);
            if(j==3){
                System.out.println("Skipping at this iteration"+" "+j);
                continue;
            }
        }

    }
}

