public class ParllelDirection {
    public static void main(String[] args) {
      mergestrings("abc","pq");
    }
    static  void mergestrings(String p,String q){
        // Here We are using parllel pointers to iterate the strings
        String res="";
        int i=0;
        while(i<p.length()||i<q.length()){
           if(i<p.length()){
               res+=p.charAt(i);
           }
           if(i<q.length()){
               res+=q.charAt(i);
           }
           i++;
        }
        System.out.println(res);
    }

}
