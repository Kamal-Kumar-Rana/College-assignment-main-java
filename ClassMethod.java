class Student {

    void display() {
        this.details();
        System.out.println("Inside the display function");

    }

    void details() {
        System.out.println("Inside the details function");

    }

}

class ClassMethod {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.display();

    }

}
