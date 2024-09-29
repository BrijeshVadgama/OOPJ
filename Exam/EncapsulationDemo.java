/**
 * EncapsulationDemo
 */
class A {
    private int x;

    public void setX(int x1) {
        x = x1;
    }

    public int getX() {
        return x;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        A a = new A();
        a.setX(14);
        System.out.println(a.getX());
    }
}