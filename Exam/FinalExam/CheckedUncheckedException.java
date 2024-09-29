// 2022_Q4_C(2) : Write a java program to demonstrate both checked and unchecked exceptions.

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