import java.util.Scanner;

class Student {

    void show(float GPA) {
        System.out.println("His College GPA is: " + GPA);
    }
}

class Employee extends Student {
    void display(float inc) {
        System.out.println("It is a Programmer,his monthly income is: " + inc);
    }
}

class Teacher extends Student {
    void display(float inc) {
        System.out.println("It is a College Professor,his monthly income is: " + inc);
    }
}

public class Hierarchicalinheritance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income of the Programmer: ");
        float incE = sc.nextFloat();
        System.out.print("Enter the college GPA of the Programmer: ");
        float gpaE = sc.nextFloat();
        System.out.print("Enter the income of the Professor: ");
        float incT = sc.nextFloat();
        System.out.print("Enter the college GPA of the Professor: ");
        float gpaT = sc.nextFloat();
        Employee e1 = new Employee();
        Teacher t1 = new Teacher();
        e1.display(incE);
        e1.show(gpaE);
        t1.display(incT);
        t1.show(gpaT);

    }

}
