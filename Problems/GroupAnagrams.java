import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        String [] strs={"","b",""};
        System.out.println(Myapproach(strs));
        System.out.println(SortingApproach(strs));
        System.out.println(HashingApproach(strs));
    }
    static  List<ArrayList<String>> Myapproach( String [] strs){
        List<ArrayList<String>> q = new ArrayList<>();
        boolean [] res = new boolean[strs.length];
        Arrays.fill(res,true);
        for(int i=0;i<strs.length;i++){
            String prefix=strs[i];
            ArrayList<String> o = new ArrayList<>();
            if(res[i]) {
                o.add(prefix);
            }
            for(int j=i+1;j<strs.length;j++){
                String inner =strs[j];
                if(inner.length()!=prefix.length() && res[i]==false && res[j]==false){
                    break;
                }else{
                    HashMap<Character,Integer> a= new HashMap<>();
                    HashMap<Character,Integer> b= new HashMap<>();
                    for(int k=0;k<prefix.length();k++){
                        char ch=prefix.charAt(k);
                        if(a.containsKey(ch)){
                            a.put(ch,a.get(ch)+1);
                        }else{
                            a.put(ch,1);
                        }
                    }
                    for(int l=0;l<inner.length();l++){
                        char ch=inner.charAt(l);
                        if(b.containsKey(ch)){
                            b.put(ch,b.get(ch)+1);
                        }else{
                            b.put(ch,1);
                        }
                    }
                    if(a.equals(b) && res[j]==true){
                        res[j]=false;
                        o.add(inner);
                    }
                }
            }
            if(o.size()>=1){
                q.add(o);
            }
        }
        return q;
    }
    static List<List<String>> SortingApproach(String [] strs){
        // In this Approach Every Element is Coverted into Sorted Array into String then compare with other Strings If Matches then pushed into it List of Strings  and others wise pushed into Hashmap with sorted string and creating new Arraylist for that Elemen=nt
        // Time Complexity -O(m*nlog(n))
        // Space Complexity -O(m*n)
        Map<String ,List<String>> res = new HashMap<>();
        for(String s:strs){
            char [] arr= s.toCharArray();
            Arrays.sort(arr);
            String sorteds= new String(arr);
            if(res.containsKey(sorteds)){
                res.get(sorteds).add(s);
            }
            else{
                ArrayList<String> in = new ArrayList<>();
                in.add(s);
                res.put(sorteds,in);
            }
        }
        return  new ArrayList<>(res.values());
    }
    static  List<List<String>> HashingApproach(String [] strs){
        Map<String,List<String>> a= new HashMap<>();
        //In This Approach Every Element in the array converted into Hashtable  and then pushed to hashmap and Compare Every Element with that key push the stating into the HashMap
        // Time Complexity is O(m*n) m -- means compare Every String in the Array n -- means  Every Element Converted into Hashtable
        // Space Complexity is O(m) -- Used for Hashtable for size 26
        for(String s:strs){
            int [] count = new int[26];
            for(char ch:s.toCharArray()){
                count[ch-'a']++;
            }
            String hashedString =Arrays.toString(count);
            if(a.containsKey(hashedString)){
                a.get(hashedString).add(s);
            }else{
                ArrayList<String> res= new ArrayList<>();
                res.add(s);
                a.put(hashedString,res);
            }
        }
        return  new ArrayList<>(a.values());
    }
}
