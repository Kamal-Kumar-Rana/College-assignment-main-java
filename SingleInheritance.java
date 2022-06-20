import java.util.Scanner;

class Employee {

    void show(float exp) {
        System.out.println("Exprence of the Employee: " + exp);
    }
}

class Programmer extends Employee {

    void display(float salary, int bonus) {
        System.out.println("Employee Total salary is:" + (salary + bonus));
        System.out.println("Bonus of Emlpoyee is:" + bonus);
    }
}

public class SingleInheritance {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary of the employee: ");
        float salary = sc.nextFloat();
        System.out.print("Enter the Bonus of the employee: ");
        int bonus = sc.nextInt();
        System.out.print("Enter the Expreance of the employee: ");
        float exp = sc.nextFloat();
        Programmer p1 = new Programmer();
        p1.display(salary, bonus);
        p1.show(exp);

    }
}
