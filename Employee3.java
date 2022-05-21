class Emp {
    Employee3 e2;

    Emp(Employee3 e2) {
        this.e2 = e2;

    }

    void display() {
        System.out.println("Employee id: " + e2.E_id + " and Employee Name: " + e2.E_name);

    }

}

class Employee3 {
    int E_id;// = 181;
    String E_name;// = "Subham Samanta";

    Employee3(int E_id, String E_name) {
        this.E_id = E_id;
        this.E_name = E_name;
        Emp e1 = new Emp(this);
        e1.display();
    }

    public static void main(String args[]) {
        Employee3 ob1 = new Employee3(181, "Subham Samanta");
        Employee3 ob2 = new Employee3(192, "Souvik Majhi");

    }

}
