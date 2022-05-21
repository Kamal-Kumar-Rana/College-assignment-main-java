class Student2 {
    void show(Student2 s2) {
        System.out.println("Method invoked successfully using this Keyword");

    }

    void call() {
        show(this);

    }

    public static void main(String args[]) {
        Student2 s1 = new Student2();
        s1.call();

    }
}
