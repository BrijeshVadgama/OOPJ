import java.util.Scanner;

/**
 * PrimeNo
 */
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, i;
        boolean flag = true;
        System.out.print("Enter Number: ");
        no = sc.nextInt();
        for (i = 2; i < no; i++) {
            if (no % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Composite Number");
        }
        // System.out.println(flag);
        sc.close();
    }
}