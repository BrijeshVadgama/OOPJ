// 2022_Q3_B(2) : Write a program with Bank as abstract class and interestRate() as abstract method. Inherit Bank class by two types of bank(SBI and HDFC class) and print their interest rate accordingly.

abstract class Bank {
    abstract void interestRate();
}

class SBI extends Bank {
    public void interestRate() {
        System.out.println("Interest Rate Of SBI Bank is 5%");
    }
}

class HDFC extends Bank {
    public void interestRate() {
        System.out.println("Interest Rate Of HDFC Bank is 6%");
    }
}

public class AbstractClassBankDemo {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();
        sbi.interestRate();
        hdfc.interestRate();
    }
}
