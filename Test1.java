//this keyword used to return current class instance
class ReturnClass {

    ReturnClass getReturnClass() {
        return this;
    }

    void display() {
        System.out.println("this keyword successfully return current class instance");

    }
}

class Test1 {

    public static void main(String args[]) {
        ReturnClass obj = new ReturnClass();
        obj.getReturnClass().display();
    }
}
