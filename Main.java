// Task 3, 5: Call methods using objects of class B
public class Main {
    public static void main(String[] args) {
        // Create an object of class B
        B obj = new B();

        // Task 3: Call the `meth` method from class A using class B's object
        // Before overriding, this will call the method from class A
        System.out.println(obj.meth()); // Output: "Method is overridden in Extended class B"

        // Task 5: Call the overridden method
        // After overriding, it calls the method from class B
        System.out.println(obj.meth()); // Output: "Method is overridden in Extended class B"
    }
}
