import java.util.Scanner;

class ArmstrongNumber {
    void armno() {
        Scanner sc = new Scanner(System.in);
        int no, sum = 0, temp, rem;
        System.out.print("Enter Three Digit Number: ");
        no = sc.nextInt();
        temp = no;
        while (temp > 0) {
            rem = temp % 10;
            temp = temp / 10;
            sum += rem * rem * rem;
        }
        if (sum == no) {
            System.out.println(no + " is an Armstrong Number");
        } else {
            System.out.println(no + " is not an Armstrong Number");
        }
        sc.close();
    }
}

public class ArmstrongNo {
    public static void main(String[] args) {
        ArmstrongNumber arm = new ArmstrongNumber();
        arm.armno();
    }
}

// public class ArmstrongNo {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int no;
// System.out.print("Enter Three Digit Number: ");
// no = sc.nextInt();

// sc.close();
// }
// }