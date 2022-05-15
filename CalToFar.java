import java.util.Scanner;

class CalToFar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature(In Centigrade): ");
        float cal = sc.nextFloat();
        float far;
        far = ((9 * cal) / 5) + 32;
        System.out.println(cal + " Centigrade in Fahrenheit is: " + far);

    }

}
