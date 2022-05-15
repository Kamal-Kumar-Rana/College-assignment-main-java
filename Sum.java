import java.util.Scanner;

class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter 2st number:: ");
        float num2 = sc.nextFloat();
        // int result = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));

    }
}
