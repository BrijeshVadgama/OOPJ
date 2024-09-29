// The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a java program that demonstrates how to establish this class hierarchy. Declare one instance variable of type String that indicates the color of a vegetable. Crete and display instances of these objects. Override the toString() method of object to return a string with the name of vegetable and its color.

abstract class Vegetable {
    String colorVegetable;

    abstract public String toString();
}

class Potato extends Vegetable {
    public String toString() {
        colorVegetable = "Yellow";
        return colorVegetable;
    }
}

class Brinjal extends Vegetable {
    public String toString() {
        colorVegetable = "Purple";
        return colorVegetable;
    }
}

class Tomato extends Vegetable {
    public String toString() {
        colorVegetable = "Red";
        return colorVegetable;
    }
}

public class VegetableDemo {
    public static void main(String[] args) {
        Vegetable p = new Potato();
        Vegetable b = new Brinjal();
        Vegetable t = new Tomato();
        System.out.println("Color of Potato  :: " + p.toString());
        System.out.println("Color of Brinjal :: " + b.toString());
        System.out.println("Color of Tomato  :: " + t.toString());
    }
}
