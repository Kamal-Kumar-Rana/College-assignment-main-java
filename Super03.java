
class Cycle {
    Cycle() {
        System.out.println("Super Class Constructor invoked Successfully! ");
    }
}

class Bike extends Cycle {
    Bike() {
        super();
        System.out.println("Sub Class Constructor invoked Successfully! ");
    }
}

class Super03 {
    public static void main(String args[]) {
        Bike b1 = new Bike();
    }
}