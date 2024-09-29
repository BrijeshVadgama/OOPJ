import java.util.Scanner;

class Bank_Account {
    Long AccountNo;
    String Username, email, accountType;
    Double AccountBalance = 1000.00;

    Scanner sc = new Scanner(System.in);

    void getAccountDetails() {
        System.out.print("Enter Username: ");
        Username = sc.next();

        System.out.print("Enter Account Number: ");
        AccountNo = sc.nextLong();

        System.out.print("Enter Email Address: ");
        email = sc.next();

        System.out.print("Enter Account Type: ");
        accountType = sc.next();
    }

    void displayAccountDetails() {
        System.out.println("Your Account Number is: " + AccountNo);
        System.out.println("Your Username Is: " + Username);
        System.out.println("Your Email Address is: " + email);
        System.out.println("Your Account Type is: " + accountType);
        System.out.println("Your Account Balance is: " + AccountBalance);
    }

    void Deposit() {
        Double Amt;
        System.out.print("Enter Amount to Deposit: ");
        Amt = sc.nextDouble();
        AccountBalance += Amt;
    }

    void Withdraw() {
        if (AccountBalance <= 1000) {
            System.out.println("Your Balance is Not Enough For Withdraw");
        } else {
            Double Amt;
            System.out.print("Enter Amount to Deposit: ");
            Amt = sc.nextDouble();
            AccountBalance -= Amt;
        }
    }

    void showBalance() {
        System.out.println("Your Balance is: " + AccountBalance);
    }
}

class Account_Details {
    public static void main(String[] args) {
        Bank_Account ba = new Bank_Account();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Check Balance");
            System.out.println("5. Show User Details");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    ba.getAccountDetails();
                    break;
                case 2:
                    ba.Deposit();
                    break;
                case 3:
                    ba.Withdraw();
                    break;
                case 4:
                    ba.showBalance();
                    break;
                case 5:
                    ba.displayAccountDetails();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}