// 2022_Q3_B(1) : Create an abstract class pen with methods write() and refill () as abstract methods and purchase() as concrete method. Call the abstract method from child class and print appropriate message.

abstract class pen {
    public abstract void write();

    public abstract void refill();

    public void purchase() {
        System.out.println("Pen Purchase");
    }
}

class Ballpen extends pen {
    public void write() {
        System.out.println("Ballpen is For Writing");
    }

    public void refill() {
        System.out.println("Refilling in Ballpen");
    }
}

public class AbstractClassPenDemo {
    public static void main(String[] args) {
        Ballpen pen = new Ballpen();
        pen.write();
        pen.refill();
        pen.purchase();
    }
}
