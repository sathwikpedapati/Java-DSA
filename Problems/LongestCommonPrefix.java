import java.util.*;
public class LongestCommonPrefix {
    public static void main(String args[]){
        String [] ref={"flower","flow","flight"};
        System.out.println(myapproach(ref));
        System.out.println(verticalscanning(ref));
        System.out.println(horizontalscanning(ref));
        System.out.println(sortingApproach(ref));
    }
    static String myapproach(String [] strs){
        String ref=strs[0];
        if(strs.length==1) return ref;
        String res="";
        int val=0;
        boolean flag=true;
        while(flag){
            for(int i=1;i<strs.length;i++){
                if(val<ref.length() && val< strs[i].length() && ref.charAt(val)==strs[i].charAt(val)){
                    continue;
                }else{
                    flag=false;
                    return res;
                }
            }
            if(flag){
                res+=ref.charAt(val);
                val++;
            }
        }
        return res;
    }
    static String verticalscanning(String [] strs){
        // Time Complexity -O(length of array * length of min substring);
        // space Complexity -O(1) because using single string
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            while(j<Math.min(prefix.length(),strs[i].length())){
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
                j++;
            }
            prefix=prefix.substring(0,j);
        }
        return prefix;
    }
    static  String horizontalscanning(String [] strs){
        // Time Complexity --> O(length of first element * compare everey element in the arr) so that O(n*m)
        // Space complexity --> using s as reference
        for(int i=0;i<strs[0].length();i++){
            for(String s:strs){
                if(i==s.length()||s.charAt(i)!=strs[0].charAt(i)){
                    return s.substring(0,i);
                }
            }
        }
        return strs[0];
    }
    static  String sortingApproach(String [] strs){
        //After Sorting Comparing first and last elements
        // if it not matches then return substring
        // if length equals to 1 then return it directly
        // time complexity -O(nlog(n)* min operations for comparsion)
        // space complexity is directly returning strs[0] substring so O(1)
        if(strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs);
        int min=Math.min(strs[0].length(),strs[strs.length-1].length());
        for(int i=0;i<min;i++){
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                return strs[0].substring(0,i);            }
        }
        return strs[0];
    }
}