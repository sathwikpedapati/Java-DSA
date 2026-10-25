import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
       methods("sathwik");
    }
    static void methods(String s){
        // Return the length of a string
        System.out.println(s.length());
        // charAt means character at position
        int pos=1;
        System.out.println(s.charAt(pos));
        // Extract the substring
        // substring(start,end)
        // give the string end-1
        System.out.println(s.substring(1,pos+2));
        // equals  means compare the String Contents
        String name ="sathwik";
        System.out.println(name.equals(s));
        // Compare the strings contents with ignore case
        String name1="SATHWIK";
        System.out.println(name1.equalsIgnoreCase(s));
        // compareTo means comapre lexigraphically
        String name2="durgaprasad";
        System.out.println(name2.compareTo(name1));
         char firstIndex='t';
        System.out.println(s.indexOf(firstIndex));
        char lastIndex='k';
        System.out.println(s.lastIndexOf(lastIndex));
        // String that contans substring return true or false;
        String naam="sath";
        String kaam ="wik";
        System.out.println(s.contains(naam));
        //  Starts with substring then return true or false
        System.out.println(s.startsWith(naam));
        // Ends with substring then return true or false
        System.out.println(s.endsWith(kaam));
        // convert String to Array
        char [] arr=s.toCharArray();
        System.out.println(Arrays.toString(arr));
        // Convert String into Upper Case and Lower Case
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        // Replace the character with another character
        String t="aabaac";
        t=t.replace('a','h');
        System.out.println(t);
        String st="a,b,c";
        String p=st.split(",")[0];
        System.out.println(p);
        System.out.println(s.isEmpty());
        String leadspaces=" sathwik ";
        System.out.println(leadspaces.strip());
        // string.replaceAll(regex, replacement);
        // replace character with another character
        // [a-z] --> small letters
        // [A-Z] --> Capital Letters
        // [0-9] --> digits
        //[\\s+] --> WhiteSpaces
        System.out.println("aaabbaac".replaceAll("a",""));
        System.out.println("aaabbaac".replaceAll("a","x"));
        // replace number with another charcters or empty spaces
        System.out.println("a1189bb89pk".replaceAll("[0-9]",""));
        System.out.println("a66690umm90".replaceAll("[0-9]","l"));
        // keep only digits remove the charcaters in it
        System.out.println("a99090899pi".replaceAll("[^0-9]",""));
        // keep english letters and not special charcters
        // what you are keeping then mention ^
        System.out.println("a!!b@@c".replaceAll("[^A-Za-z]",""));
        // Removing white space in between them
        System.out.println("hello world".replaceAll("\\s",""));
        // Every character is replaced with another character
        System.out.println("hello.".replaceAll(".","*"));
    }
}
