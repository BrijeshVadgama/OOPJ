import java.util.Scanner;

public class InputUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.next();
        System.out.print("Enter Roll No: ");
        int rno = sc.nextInt();
        System.out.println("Your Name is: "+name+"\nYour Roll No is: "+rno);
        sc.close();
    }
}
