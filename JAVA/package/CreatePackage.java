/**
 * CreatePackage
 */
package mypkg;

import java.util.Scanner;

public class CreatePackage {
    Scanner sc = new Scanner(System.in);

    public void add() {
        System.out.print("Enter Number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int n2 = sc.nextInt();
        System.out.println("Sum " + n1 + " + " + n2 + " = " + (n1 + n2));
    }
}