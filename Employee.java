class Employee {
    int id;
    String name;

    Employee(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parametarize Constructor invoked successfully");

    }

    void display() {
        System.out.println("Employee ID is: " + id + " And Employee Name is: " + name);

    }

    
    public static void main(String args[]) {
        Employee e1 = new Employee(20201489, "Kamal Kumar Rana");
        e1.display();
    }

}