/**
 * SingleInheritanceDemo
 */

class A {
    void a() {
        System.out.println("This is class A");
    }
}c

class B extends A {
    void b() {
        System.out.println("This is class B that extends class A");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        B b = new B();
        b.a();
        b.b();
    }
}
