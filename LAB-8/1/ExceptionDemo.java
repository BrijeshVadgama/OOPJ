// Write a method for computing xy doing repetitive multiplication. X and y are of type integer and are to be given as command line arguments. Raise and handle exception(s) for invalid values of x and y.
/**
 * Exception
 */

public class ExceptionDemo {
    public static void main(String[] args) {
        int x, y, ans;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            ans = 1;
            for (int i = 1; i <= y; i++) {
                ans = ans * y;
            }
            System.out.println("Multiplication :: " + ans);
        } catch (Exception e) {
            System.out.println("Invalid Value of x and y");
        }
    }
}
