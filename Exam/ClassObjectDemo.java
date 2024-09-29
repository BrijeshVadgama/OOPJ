/**
 * ClassObjectDemo
 */
// class Disp {
// Disp() {
// System.out.println("This is Default Constructor::");
// }

// void A() {
// System.out.println("This is method A");
// }

// void B() {
// System.out.println("This is method B");
// }
// }

// public class ClassObjectDemo {
// public static void main(String[] args) {
// Disp a = new Disp();
// a.A();
// a.B();
// }
// }

class Person {
    public String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Copy Constructor
    public Person(Person otherPerson) {
        this.name = otherPerson.name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person(person1);

        System.out.println("Original Person's name: " + person1.getName());
        System.out.println("Copy of the Person's name: " + person2.getName());
    }
}
