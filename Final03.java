final class Car {
    void run() {
        System.out.println("Car running safely with 60kmph");
    }
}

class SportsCar extends Car {
    void run() {
        System.out.println("Sports Car running safely with 100kmph");
    }
}

public class Final03 {
    public static void main(String args[]) {
        SportsCar s1 = new SportsCar();
        s1.run();
    }

}
