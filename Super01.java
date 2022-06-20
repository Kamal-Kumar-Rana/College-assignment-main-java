class Car {
    String color = "It is a Car and its Color is: Blue";
}

class SportsCar extends Car {
    String color = "It is a SportsCar and its Color is: Red";

    void display() {
        System.out.println(color);// prints color of Dog class
        System.out.println(super.color);// prints color of Animal class
    }
}

class Super01 {
    public static void main(String args[]) {
        SportsCar s1 = new SportsCar();
        s1.display();
    }
}
