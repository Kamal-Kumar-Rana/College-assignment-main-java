class Student {
    Student() {
        System.out.println("Student Detail:");

    }

    Student(int x, String n) {
        this();
        System.out.println("Student Roll no: " + x + " Name is: " + n);
    }

}

public class ClassConstructor {
    public static void main(String args[]) {
        Student s1 = new Student(1728, "Kamal");
        Student s2 = new Student(1757, "Suvojit");
        Student s3 = new Student(1760, "Shartak");
    }

}
