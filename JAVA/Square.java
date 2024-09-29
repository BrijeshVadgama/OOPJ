import java.util.Scanner;

public class Square {
    // Function to calculate the square of a number
    public static double square(double number) {
        return number * number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double userInput = sc.nextDouble();

        // Call the square() function and print the result
        double result = square(userInput);
        System.out.println("Square of " + userInput + " is: " + result);

        sc.close();
    }
}
