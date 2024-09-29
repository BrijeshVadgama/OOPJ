// 2022_Q3_C(1) Write a program to implement multiple inheritance using interface.

interface MyInterface1 {
    void meth1();
}

interface MyInterface2 {
    void meth2();
}

class MultipleInheritanceClass implements MyInterface1, MyInterface2 {
    public void meth1() {
        System.out.println("This is Method Of MyInterface1");
    }

    public void meth2() {
        System.out.println("This is Method Of MyInterface2");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        MultipleInheritanceClass mic = new MultipleInheritanceClass();
        mic.meth1();
        mic.meth2();
    }
}