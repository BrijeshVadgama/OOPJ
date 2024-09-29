// 2022_Q1_C(1) : Write a program to sort elements of an array in descending order.

import java.util.Scanner;

class SortArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        int temp;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element - " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Element in Descending Order After Sorting::");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}

// 2022_Q1_C(2) : Write a program to return the square of a user defined number
// using square() function.

import java.util.Scanner;

class Square {
    int square;

    void squareofno(int s) {
        square = s * s;
        System.out.println("Square :: " + square);
    }
}

public class SqureOfUserDefinedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Find Square:: ");
        int num = sc.nextInt();
        Square square = new Square();
        square.squareofno(num);
        sc.close();
    }
}

// ----------------------- OR -----------------------

public class SqureOfUserDefinedNumber {
    public static int Square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, printSquare;
        System.out.print("Enter Number to Find Square:: ");
        num = sc.nextInt();
        printSquare = Square(num);
        System.out.println("Square :: " + printSquare);
        sc.close();
    }
}

// 2022_Q2_B(2) : Write a program to Display Employee details(emp_name,
// emp_salary,emp_designation) using class & objects.

import java.util.Scanner;

class emp_details {
    Scanner sc = new Scanner(System.in);
    String emp_name, emp_designation;
    float emp_salary;

    public void getEmpDetails() {
        System.out.print("Enter Employee Name:: ");
        emp_name = sc.nextLine();
        System.out.print("Enter Employee Salary:: ");
        emp_salary = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter Employee Designation:: ");
        emp_designation = sc.nextLine();
    }

    public void showEmpDetails() {
        System.out.println("----------------------");
        System.out.println("Employee Name is:: " + emp_name);
        System.out.println("Employee Salary is:: " + emp_salary);
        System.out.println("Employee Designation is:: " + emp_designation);
    }
}

public class ClassObjDemo {
    public static void main(String[] args) {
        emp_details ed = new emp_details();
        ed.getEmpDetails();
        ed.showEmpDetails();
    }
}

// 2022_Q3_B(1) : Create an abstract class pen with methods write() and refill
// () as abstract methods and purchase() as concrete method. Call the abstract
// method from child class and print appropriate message.

abstract class pen {
    public abstract void write();

    public abstract void refill();

    public void purchase() {
        System.out.println("Pen Purchase");
    }
}

class Ballpen extends pen {
    public void write() {
        System.out.println("Ballpen is For Writing");
    }

    public void refill() {
        System.out.println("Refilling in Ballpen");
    }
}

public class AbstractClassPenDemo {
    public static void main(String[] args) {
        Ballpen pen = new Ballpen();
        pen.write();
        pen.refill();
        pen.purchase();
    }
}

// 2022_Q3_B(2) : Write a program with Bank as abstract class and interestRate()
// as abstract method. Inherit Bank class by two types of bank(SBI and HDFC
// class) and print their interest rate accordingly.

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

// 2022_Q3_C(1) Write a program to implement multiple inheritance using
// interface.

interface MyInterface1 {
    void meth1();
}

interface MyInterface2 {
    void meth2();
}

class MultipleInheritanceClass implements MyInterface1, MyInterface2 {
    public void meth1() {
        System.out.println("This is Method Of MyInterface1");
    }

    public void meth2() {
        System.out.println("This is Method Of MyInterface2");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        MultipleInheritanceClass mic = new MultipleInheritanceClass();
        mic.meth1();
        mic.meth2();
    }
}

// 2022_Q3_C(2) : Write a java program to implement dynamic method dispatch.

class Car {
    public void Run() {
        System.out.println("Car Running On The Road");
    }
}

class JeepCompass extends Car {
    public void Run() {
        System.out.println("JeepCompass Car Running On The Road");
    }
}

class Mercedes extends Car {
    public void Run() {
        System.out.println("Mercedes Car Running On The Road");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new JeepCompass();
        Car c3 = new Mercedes();
        c1.Run();
        c2.Run();
        c3.Run();
    }
}

// 2022_Q4_C(1) : Write a program to create two threads, one thread will print
// odd numbers and second thread will print even numbers between 1 to 20
// numbers.

class Threadodd_even extends Thread {
    Threadodd_even() {
        start();
    }

    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd Number :: " + i);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException ae) {
            System.out.println("Exception :: " + ae.toString());
        }
    }
}

public class PrintOddEvenNumberUsingThread {
    public static void main(String[] args) {
        new Threadodd_even();
        try {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even Number :: " + i);
                    Thread.sleep(3000);
                }
            }
        } catch (InterruptedException ae) {
            System.out.println("Exception :: " + ae.toString());
        }
    }
}

// 2022_Q4_C(2) : Write a java program to demonstrate both checked and unchecked
// exceptions.

import java.util.Scanner;
import java.io.*;

public class CheckedUncheckedException {
    public static void checkedExceptionExample() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File Name:: ");
        String fname = sc.nextLine();
        try {
            FileReader fr = new FileReader(fname);
            System.out.println("---------------------");
            System.out.println("File is Found!");
            System.out.println("---------------------");
            System.out.println();
        } catch (FileNotFoundException fnfe) {
            System.out.println("--------------------------------");
            System.out.println("Sorry! This File Can Not Found");
            System.out.println("--------------------------------");
            System.out.println();
        }
    }

    public static void uncheckedExceptionExample() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:: ");
        int no = sc.nextInt();
        System.out.print("Enter Number to Divide:: ");
        int no1 = sc.nextInt();
        try {
            int res = no / no1;
            System.out.println("--------------------");
            System.out.println("Ans is:: " + res);
            System.out.println("--------------------");
        } catch (ArithmeticException ae) {
            System.out.println("----------------------------------");
            System.out.println("Sorry! Cannot Divide By Zero");
            System.out.println("----------------------------------");
        }
    }

    public static void main(String[] args) {
        checkedExceptionExample();
        uncheckedExceptionExample();
    }
}

// 2022_Q5_C(1) : Write a program to demonstrated ArrayList and LinkedList in
// java.

import java.util.*;

public class ArrayListLinkedList {
    public static void main(String[] args) {
        // Array List

        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Yamaha FZ-S");
        arrayList.add("Yamaha R15");
        arrayList.add("Yamaha MT-15");
        System.out.println();
        System.out.println("ArrayList Elements::");
        System.out.println("\t" + arrayList);

        // Linked List

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("Jeep Compass");
        linkedList.add("Mercedes Benz");
        linkedList.add("BMW");
        System.out.println();
        System.out.println("LinkedList Elements::");
        System.out.println("\t" + linkedList);
    }
}

// 2022_Q5_C(2) : Write a program that counts number of characters, words and
// lines in a file. Use exceptions to check whether the file that is read exists
// or not.

import java.io.*;

public class CountCharacterWordLine {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file1.txt");
            BufferedReader reader = new BufferedReader(fr);

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                // Count characters
                charCount += line.length();

                // Count words
                String[] words = line.split("\\s");
                wordCount += words.length;

                // Counting lines
                lineCount++;
            }

            reader.close();

            System.out.println("Number of characters:: " + charCount);
            System.out.println("Number of words:: " + wordCount);
            System.out.println("Number of lines:: " + lineCount);

        } catch (IOException e) {
            System.out.println("Sorry! This File Cannot Found");
        }
    }
}