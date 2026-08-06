package Collections.ArrayList;

import java.util.ArrayList;
import java.util.*;

public class Intro{
    public static void main(String args[]){
      ArrayList <Integer> num= new ArrayList<>();
       num.add(1);
       num.add(2);
       num.add(3);
       num.add(4);
       methods(num);
    }
    static void methods(ArrayList<Integer> a){
        // Printing
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
        // Added the element at end 
        a.add(6);
        System.out.println(a);
        // Added the Element based on the index
        a.add(1,4);
        System.out.println(a);
        // access the index based on the element
        System.out.println(a.indexOf(1));
        // remove the element based on the index
        a.remove(4);
        System.out.println(a);
        // get the data based on the index
        System.out.println(a.get(3));
        // prints the size
        System.out.println(a.size());
        // update the element based on the index
        a.set(1,8);
        System.out.println(a);
        // convert them into string
        System.out.println(a.toString());
        a.sort(null);
        System.out.print(a);
    }
}