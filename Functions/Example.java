public class Example {
    public static void main(String[] args) {
        int i=10;
        int j=56;
        swap(i, j); // Just Passing the values of the reference variables 
        // When i used to print the i and j then it will print the 10 and 56 but 56 and 10 
        // So they passing the values only not references
        System.out.println(i +" "+j);
    }
    static void swap(int a,int b){
        // Here Just Creating new Object to change the values not update the values
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
