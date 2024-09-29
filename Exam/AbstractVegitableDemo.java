// The abstract vegetable class has three subclasses named Potato, Brinjal and
// Tomato. Write a java program that demonstrates how to establish this class
// hierarchy. Declare
// one instance variable of type String that indicates the color of a vegetable.
// Crete and display instances of these objects. Override the toString() method
// of object to return a string with the name of vegetable and its color.

/**
 * Vegitable
 */

abstract class Vegitable {
    String colorVegitable;

    abstract public String toString();
}

class Potato extends Vegitable {
    public String toString() {
        colorVegitable = "Yellow";
        return colorVegitable;
    }
}

class Brinjal extends Vegitable {
    public String toString() {
        colorVegitable = "Purple";
        return colorVegitable;
    }
}

class Tomato extends Vegitable {
    public String toString() {
        colorVegitable = "Red";
        return colorVegitable;
    }
}

public class AbstractVegitableDemo {
    public static void main(String[] args) {
        Vegitable p = new Potato();
        Vegitable b = new Brinjal();
        Vegitable t = new Tomato();
        System.out.println("The Color of Potato  :: " + p.toString());
        System.out.println("The Color of Brinjal :: " + b.toString());
        System.out.println("The Color of Tomato  :: " + t.toString());
    }
}