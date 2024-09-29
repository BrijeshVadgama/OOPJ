import java.util.Scanner;

/**
 * CubeInheritEx
 */

class Cube {
    protected double height, width, depth;

    Cube() {
        System.out.println("Inside Default Constructor :: CUBE");
    }

    double voulme() {
        return height * width * depth;
    }
}

class CubeWeight extends Cube {
    double weight;

    CubeWeight(double h, double w, double d, double we) {
        System.out.println("Inside Constructor :: CUBEWEIGHT");
        height = h;
        width = w;
        depth = d;
        weight = we;
    }
}

public class CubeInheritEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter h1: ");
        double h1 = sc.nextDouble();
        System.out.print("Enter w1: ");
        double w1 = sc.nextDouble();
        System.out.print("Enter d1: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter we1: ");
        double we1 = sc.nextDouble();
        System.out.println("----------------");
        System.out.print("Enter h2: ");
        double h2 = sc.nextDouble();
        System.out.print("Enter w2: ");
        double w2 = sc.nextDouble();
        System.out.print("Enter d2: ");
        double d2 = sc.nextDouble();
        System.out.print("Enter we2: ");
        double we2 = sc.nextDouble();
        System.out.println();

        CubeWeight cw1 = new CubeWeight(h1, w1, d1, we1);
        CubeWeight cw2 = new CubeWeight(h2, w2, d2, we2);

        System.out.println("cw1.volume() = " + cw1.voulme());
        System.out.println("cw1.volume() = " + cw2.voulme());

        sc.close();
    }
}