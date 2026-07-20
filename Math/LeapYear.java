// Divide by 4 and 400 is Leap Year
// divide by 100 is not leap year
// so that check first with 100 and 400 and 4 
// 1600, 2000 - leap
// 1700,1800,1900 - not leap
// 2024,2028 - leap

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
    static void check(int num){
        if(num%100==0){
           if(num%400==0){
            System.out.println("Leap Year");
           }else{
            System.out.println("Not Leap Year");
           }
        }else{
            if(num%4==0){
                System.out.println("Leap Year");
            }else{
                System.out.println("Not Leap Year");
            }
        }

    }
}
