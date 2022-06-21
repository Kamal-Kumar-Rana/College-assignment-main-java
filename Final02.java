class Bike {
    final void run() {
        System.out.println("Bike running safely with 70kmph");
    }
}

class Bus extends Bike {
    void run() {
        System.out.println("Bus running safely with 60kmph");
    }
}

public class Final02 {
    public static void main(String args[]) {
        Bus b1 = new Bus();
        b1.run();
    }

}
