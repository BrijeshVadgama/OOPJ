// 2022_Q5_C(1) : Write a program to demonstrated ArrayList and LinkedList in java.

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
