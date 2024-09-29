import java.util.Scanner;

class Account {
    Double amount = 5000.00;

    void Display() {
        System.out.println("\n---------------------------------");
        System.out.println("Your Account Balance is: " + amount);
        System.out.println("---------------------------------");
    }

    void Deposit(Double da) {
        amount += da;
    }

    void Withdraw(Double dw) {
        try {
            if ((amount - dw) < 5000) {
                throw new Exception("Your Balance is Not Enough For Withdraw!");
            } else {
                amount -= dw;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();
        while (true) {
            System.out.print("\n1. Display \n2. Deposit \n3. Withdraw \n4. Exit \nSelect Your Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ac.Display();
                    break;

                case 2:
                    System.out.print("\nEnter Amount You Want to Deposit: ");
                    double amtd = sc.nextDouble();
                    ac.Deposit(amtd);
                    ac.Display();
                    break;

                case 3:
                    System.out.print("\nEnter Amount You Want to Withdraw: ");
                    double amtw = sc.nextDouble();
                    ac.Withdraw(amtw);
                    ac.Display();
                    break;

                case 4:
                    System.out.println("\nThank You!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid Choice Please Try Again");
            }
            sc.close();
        }
    }
}