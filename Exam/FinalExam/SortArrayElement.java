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