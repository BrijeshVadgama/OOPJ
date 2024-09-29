interface MyInterface {
    public void meth1();

    public void meth2();
}

class A implements MyInterface {
    public void meth1() {
        System.out.println("This is Inside Method 1");
    }

    public void meth2() {
        System.out.println("This is Inside Method 2");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        A a = new A();
        a.meth1();
        a.meth2();
    }
}