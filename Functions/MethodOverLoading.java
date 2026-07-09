public class MethodOverLoading {
    // MethodOverloading - Number of Parameters and changing the parameters and order of parameters with same function name
    // In method return type and parameters are same or return type is small and parameter is large then convert the return with typecast transformation
    // You cannot overload a method by changing only its return type. The parameters must be different.

    public static void main(String[] args) {
        // Number Of parameters 
        System.out.println(result(90, 67));
        System.out.println(result(67,89,90));
        // Different types of parameters
        // Let If method is overloaded when return type and parameters list also changed
        System.out.println(result(90.9, 78.7));
        System.out.println(result(9, 76.9,78.9));
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
    static int result(int i,double j,double k){
        return(int) (i+j+k);
    }  // shows the error because dupliate method with different return type but same paramters
    // you cannot overload the method
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
