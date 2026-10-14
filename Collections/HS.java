import java.util.*;

public class HS{
    public static void main(String[] args) {
        // Set is Unordered List and It doesnt allow the Duplicates
        HashSet <Integer> st = new HashSet<>();
        st.add(1);
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        System.out.println(st);
        st.remove(1);
        System.out.println(st);
        // Searching the Element based on the contains method
        if(st.contains(2)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
        // Is empty
        System.out.println("Is Empty"+" "+st.isEmpty());
        // Size
        System.out.println("Size of the set" +" "+st.size());
        Iterator <Integer> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // Clear the data in the Set
        st.clear();
        System.out.println(st);
    }
}