interface Floor {
    // Floor(){ }
    public void Fl();
}

class A implements Floor {

    public void Fl() {
        System.out.println("hello");
    }
}

public class ex {
    public static void main(String[] args) {
        System.out.print("Floor\n");
        A a = new A();
        a.Fl();
    }

}