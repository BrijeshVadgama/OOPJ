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