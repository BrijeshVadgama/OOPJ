/**
 * MultiLevelInheritanceDemo
 */

class A {
    void a() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void b() {
        System.out.println("This is class B that extends class A");
    }
}

class C extends B {
    void c() {
        System.out.println("This is class C that extends class B");
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        C c = new C();
        c.a();
        c.b();
        c.c();
    }
}
