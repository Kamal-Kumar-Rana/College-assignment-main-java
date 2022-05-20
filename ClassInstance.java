public class ClassInstance {
    int E_id, P_id;
    String E_Name;

    ClassInstance(int E_id, int P_id, String E_Name) {
        this.E_id = E_id;
        this.P_id = P_id;
        this.E_Name = E_Name;

    }

    void display() {
        System.out.println(
                "Employee id is:" + E_id + " Employee Name is: " + E_Name + "who has assigned to project id: " + P_id);

    }

    public static void main(String args[]) {
        ClassInstance ob1 = new ClassInstance(1728, 16, "Kamal Kumar Rana");
        ClassInstance ob2 = new ClassInstance(1708, 26, "Ratan Bera");
        ob1.display();
        ob2.display();

    }
}
