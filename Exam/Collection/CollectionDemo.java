import java.io.File;
import java.util.*;

/**
 * CollectionDemo
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // List<String> l1 = new ArrayList<String>();
        // l1.add("Hello");
        // l1.add("Welome to Darshan Universiry");
        // l1.add("How r u?");
        // System.out.println("ArrayList Elements::");
        // System.out.print("\t" + l1);

        // List<String> a1 = new LinkedList<String>();
        // a1.add("OOPJ");
        // a1.add("WT");
        // a1.add("DBMS");
        // System.out.println();
        // System.out.println("LinkedList Elements::");
        // System.out.print("\t" + a1);

        File f = new File("/java/system");
        System.out.println(f.getAbsolutePath());
    }
}