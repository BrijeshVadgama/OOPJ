/**
 * InterfaceDemo
 */

interface i1 {
    public void in1();
}

interface i2 {
    public void in2();

}

class A implements i1, i2 {
    public void in1() {
        System.out.println("This is interface i1 method");
    }

    public void in2() {
        System.out.println("This is interface i2 method");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        A a = new A();
        a.in1();
        a.in2();
    }
}