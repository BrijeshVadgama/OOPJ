import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        int n, flag = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        n = sc.nextInt();
        i = 1;
        while (i <= n) {
            if (n % i == 0) {
                flag += 1;
            }
            i++;
        }
        if (flag == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }
}