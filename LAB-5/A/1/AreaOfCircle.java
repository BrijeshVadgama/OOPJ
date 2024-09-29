import java.util.*;

class Area {
    double area;

    void arcircle(double r) {
        area = 3.14 * r * r;
        System.out.println("Area: " + area);
    }
}

class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The radius: ");
        double r = sc.nextDouble();
        Area area = new Area();
        area.arcircle(r);
        sc.close();
    }
}