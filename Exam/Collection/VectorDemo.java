import java.util.Vector;

/**
 * VectorDemo
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(5, 3);
        v.add(3);
        v.add(33);
        v.add(88);
        v.add(56);
        v.add(57);
        v.add(59);
        // v.add(90);
        // v.add(95);
        // v.add(94);
        System.out.println("v.capacity(): " + v.capacity());
        System.out.println("v size(): " + v.size());
        System.out.println(v);
    }
}