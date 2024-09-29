import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        float r = sc.nextFloat();
        System.out.println("Area Of Circle is: "+(3.14*r*r));
        sc.close();
    }
}
