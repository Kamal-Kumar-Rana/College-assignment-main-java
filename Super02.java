class Student {
    void show() {
        System.out.println("Super Class Method invoked Successfully! ");
    }
}

class Emlpoyee extends Student {
    void show() {
        System.out.println("Sub Class Method invoked Successfully! ");
    }

    void print() {
        System.out.println("Another Sub Class Method invoked Successfully! ");
    }

    void work() {
        show();
        super.show();
        print();
    }
}

class Super02 {
    public static void main(String args[]) {
        Emlpoyee e1 = new Emlpoyee();
        e1.work();
    }
}