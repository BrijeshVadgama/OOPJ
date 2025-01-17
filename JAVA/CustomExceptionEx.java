/**
 * CustomExceptionEx
 */
class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class CustomExceptionEx {
    static int currentBalance = 5000;

    public static void main(String[] args) {
        try {
            int amount = Integer.parseInt(args[0]);
            withdraw(amount);
        } catch (Exception e) {
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }

    public static void withdraw(int amount) throws Exception {
        int newBalance = currentBalance - amount;
        if (newBalance < 1000) {
            throw new MyException("Darshan Exception");
        }
    }
}