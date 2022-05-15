import java.util.Scanner;

class FarToCal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature(In Fahrenheit): ");
        float far = sc.nextFloat();
        float cal;
        cal = ((far - 32) * 5) / 9;
        System.out.println(far + " Fahrenheit in Centigrade is: " + cal);

    }

}
