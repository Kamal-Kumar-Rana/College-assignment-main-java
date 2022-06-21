import java.util.Scanner;

interface A {
    void average(int a);

    void factorial(int b);

}

interface B {
    void average(int a);

}

interface C extends A, B {
    void factorial(int b);

}

class Display implements C {
    public void average(int a) {
        float sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println("Average of " + a + " numbers is: " + (sum / a));
    }

    public void factorial(int b) {
        int fact = 1;
        for (int i = 1; i <= b; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + b + " is: " + fact);
    }

    void display() {
        System.out.println("Display method invoked Successfully!");
    }

}

public class InterfaceTest03 {
    public static void main(String args[]) {
        Display obj = new Display();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter th value of n: ");
        int n = sc.nextInt();
        obj.factorial(n);
        obj.average(n);
        obj.display();

    }
}
