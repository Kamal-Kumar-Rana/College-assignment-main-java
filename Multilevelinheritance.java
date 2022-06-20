
class Student {
    void show() {
        System.out.println("Super Class Invoked successfully");
    }
}

class Employee extends Student {
    void display() {
        System.out.println("Intermediate Super Class Invoked successfully");
    }
}

class Devoloper extends Employee {
    void print() {
        System.out.println("Sub Class Invoked successfully");
    }
}

public class Multilevelinheritance {
    public static void main(String args[]) {
        Devoloper obj = new Devoloper();
        obj.show();
        obj.display();
        obj.print();

    }

}
