public class Employee2 {

    int id;
    String name;
    int age;

    Employee2(int i, String n) {
        id = i;
        name = n;
        // System.out.println("Parametarize Constructor invoked successfully");

    }

    Employee2(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
        // System.out.println("Parametarize Constructor invoked successfully");

    }

    void display() {
        System.out.println("Employee ID is: " + id + " Employee Name is: " + name + "and Employee age is: " + age);

    }

    public static void main(String args[]) {
        Employee2 e1 = new Employee2(20201489, "Kamal Kumar Rana", 20);
        Employee2 e2 = new Employee2(20201450, "Ratan Bera");
        e1.display();
        e2.display();
    }

}
