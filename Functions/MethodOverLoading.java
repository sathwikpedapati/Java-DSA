public class MethodOverLoading {
    // MethodOverloading - Number of Parameters and changing the parameters and order of parameters with same function name
    // In method return type and parameters are same or return type is small and parameter is large then convert the return with typecast transformation
    // You cannot overload a method by changing only its return type. The parameters must be different.

    public static void main(String[] args) {
        // Number Of parameters 
        System.out.println(result(90, 67));
        System.out.println(result(67,89,90));
        // Different types of parameters
        System.out.println(result(90, 78));
        // Order of Parameters
        // Method names is same but order of parameters is different
        form(90,"sathwik");
        form("Sathwik", 89);
    }
    static int result(int a,int b){
        return a+b;
    }
    static int result(int a,int b,int c){
        return a+b+c;
    }
    static double result(double a,double b){
        return a+b;
    }
    static void form(int rollno, String name){
        System.out.println("My Name is" +" "+name+" "+"RollNo is"+" "+rollno);
    }
    static void form(String naam, int roll){
        System.out.println("My naam is"+" "+naam +" "+"Id is "+roll);
    }
}
