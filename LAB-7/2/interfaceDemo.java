/**
 * interfaceDemo
 */

interface A {
    void methA();
}

interface A1 extends A {
    void methA1();
}

interface A2 extends A {
    void methA2();
}

interface P1 {
    void methP1();
}

interface P2 {
    void methP2();
}

interface A12 extends P1, P2 {
    void methA12();
}

class B implements A12 {
    public void methA() {
        System.out.println("This is inside method A");
    }

    public void methA1() {
        System.out.println("This is inside method A1 that extends A");
    }

    public void methA2() {
        System.out.println("This is inside method A2 that extends A");
    }

    public void methP1() {
        System.out.println("This is inside method P1");
    }

    public void methP2() {
        System.out.println("This is inside method P2");
    }

    public void methA12() {
        System.out.println("This is inside method A12 that extends P1,P2");
    }
}

public class interfaceDemo {
    public static void main(String[] args) {
        B b = new B();
        b.methA();
        b.methA1();
        b.methA2();
        b.methP1();
        b.methP2();
        b.methA12();
    }
}