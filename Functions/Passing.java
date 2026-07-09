public class Passing {
    // Primitive DataTypes --> use pass by value
    // object or other stuff ---> use pass by value of the references
    public static void main(String[] args) {
        // Java Follows the Pass by Value
        String name="Sathwik"; // name is pointing towards the Sathwik(Object)
        String res=Greet(name); // just copy of reference of the name variable is pass through the Greet Function
        System.out.println(res);
        System.out.println(name);
    }
    static String Greet(String naam){ 
        // Intially naam is pointing towards the Sathwik(object)
        // After New Local Variable is created then update it 
        naam ="Viroop"; // Completely Create the New local Variable then naam  is pointing towards Viroop(Object) Not update the naam variable 
        return naam;
    }
}
