/**
 * RunTimePolymorphism
 */

class A {
    void message() {
        System.out.println("This is class A message");
    }
}

class B extends A {
    void message() {
        // super.message(); // to print method of parent class
        System.out.println("This is class B message");
    }
}

public class RunTimePolymorphismDemo {
    public static void main(String[] args) {
        B b = new B();
        b.message();
    }
}