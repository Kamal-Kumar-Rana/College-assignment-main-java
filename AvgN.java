
import java.util.Scanner;

public class AvgN {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
        System.out.println("Average of " + n + " numbers is: " + (float) (sum / n));

    }

}
