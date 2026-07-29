import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HM{
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();
        // Hashmap stores the data in the form of keys and values
        map.put("sathwik", 1);
        map.put("Sowshik",2);
        map.put("Vanshika", 3);
        map.put("Siddhu",4);
        System.out.println(map);
        // Searching data based on the key
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        if(map.containsKey(s)){
            System.out.println("Key is found"+" "+map.get(s));
        }else{
            System.out.println("Key is not found"+" "+map.get(s));
        }
        // Return the size
        System.out.println(map.size());
        // return the hashmap is empty
        System.out.println(map.isEmpty());
        // Return the hashmap as string
        // System.out.println(map.toString());
        // Iterating the Hashmap
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        //using set to iterate
        Set <String> keys= map.keySet();
        for( String k:keys){
            System.out.println(k+" "+map.get(k));
        }
        // mentioned in the for loop
        for(String i:map.keySet()){
            System.out.println(map.get(i)+" "+i);
        }
        // To remove the data based on the key in  the Hashmap
        map.remove("sathwik");
        System.out.println(map);
        // Clear data in the Hashmap
        map.clear();
        System.out.println(map);

    }
}