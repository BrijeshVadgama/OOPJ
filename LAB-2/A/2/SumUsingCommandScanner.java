import java.util.Scanner;

public class SumUsingCommandScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int n2 = sc.nextInt();
        System.out.println("Sum Of Two Number is: "+(n1+n2));
        // System.out.print("Sum of Two Number is: "+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
        sc.close();
    }
}