import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static  void main(String [] args){
        String s="anagram";
        String t="nagaram";
        System.out.println(SortingApproach(s,t));
        System.out.println(DoubleHashMapApproach(s,t));
        System.out.println(SingleHashMapApproach(s,t));
        System.out.println(SingleHashTableApproach(s,t));
        System.out.println(DoubleHashTableApproach(s,t));
    }
    static  boolean SortingApproach(String s, String t){
        // Time Complexity - O(mlogm+nllogn)
        // Space Complexity -O(1)
        // m for s.length and n for t.length
        if(s.length()!=t.length()){
            return false;
        }
        char [] sarr=s.toCharArray();
        char [] tarr=t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        return Arrays.equals(sarr,tarr);
    }
    static boolean DoubleHashMapApproach(String s,String t){
        // Time Complexity -O(n)
        // Space Complexity -(m+n)
        // m for s.length and n for t.length
        HashMap<Character,Integer> a= new HashMap<>();
        HashMap<Character,Integer> b= new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(a.containsKey(ch)){
                a.put(ch,a.get(ch)+1);
            }else{
                a.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            if(b.containsKey(ch)){
                b.put(ch,b.get(ch)+1);
            }else{
                b.put(ch,1);
            }
        }
        return a.equals(b);
    }
    static  boolean SingleHashMapApproach(String s,String t){
        // Time Complexity is O(n)
        // Space Complexity is O(n)
        // n for both s and t lengths
        HashMap<Character,Integer> res = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(res.containsKey(ch)){
                res.put(ch,res.get(ch)+1);
            }else{
                res.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            if(res.containsKey(ch)){
                res.put(ch,res.get(ch)-1);
            }else{
                res.put(ch,1);
            }
        }
        for(char ch:res.keySet()){
            if(res.get(ch)!=0){
                return false;
            }
        }
        return  true;
    }
    static  boolean SingleHashTableApproach(String s,String t){
        // Time Complexity - O(n)
        // Space Complexity - O(n)
        // n for size of check array
        int [] check=new int [26];

        if(s.length()!=t.length()){
            return  false;
        }
        for(int i=0;i<s.length();i++){
            check[s.charAt(i)-'a']++;
            check[t.charAt(i)-'a']--;
        }
        for(int val:check){
            if(val!=0){
                return  false;
            }
        }
        return  true;
    }
    static  boolean DoubleHashTableApproach(String s,String t){
        // Time Complexity is O(n)
        // Space Complexity is O(n+n)
        //  n for check array size
        if(s.length()!=t.length()){
            return  false;
        }
        int []scheck=new int [26];
        int []tcheck= new int[26];
        for(int i=0;i<s.length();i++){
            scheck[s.charAt(i)-'a']++;
            tcheck[t.charAt(i)-'a']++;
        }
        return  Arrays.equals(scheck,tcheck);
    }
}
