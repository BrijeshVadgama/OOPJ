// 2022_Q1_C(2) : Write a program to return the square of a user defined number using square() function.

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