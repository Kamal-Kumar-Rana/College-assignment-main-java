import java.util.Scanner;

interface A {

    int EvenOdd(int a);

    void show();
}

interface B {
    int PositiveNegative(int b);

    void show();
}

class Display implements A, B {
    public int EvenOdd(int a) {
        if (a % 2 == 0) {
            return (0);
        } else {
            return (1);
        }

    }

    public int PositiveNegative(int b) {
        if (b > 0) {
            return (0);
        } else {
            return (1);
        }
    }

    public void show() {
        System.out.println("Show Method invoked Successfully!");
    }
}

class InterfaceTest02 {
    public static void main(String[] args) {
        Display obj = new Display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int num = sc.nextInt();
        int x = obj.EvenOdd(num);
        int y = obj.PositiveNegative(num);
        if (x == 0)
            System.out.print(num + " is Even");
        else
            System.out.print(num + " is Odd");
        if (y == 0)
            System.out.println(" and it is Positive");
        else
            System.out.println(" and it is Negative");

        obj.show();
    }
}
