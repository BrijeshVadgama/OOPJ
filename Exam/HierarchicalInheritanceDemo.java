/**
 * HierarchicalInheritanceDemo
 */

class A {
    void a() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void b() {
        // super.a(); // use of super keyword
        System.out.println("This is class B that extends class A");
    }
}

class C extends A {
    void c() {
        System.out.println("This is class C that extends class A");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        C c = new C();
        c.a();
        // c.b(); // it generates compile time error
        c.c();

        // if write this than it cannot be generate any error
        B b = new B();
        b.b();
    }
}