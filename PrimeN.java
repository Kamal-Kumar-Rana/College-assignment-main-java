import java.util.Scanner;

class PrimeN {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("All Prime number upto " + n);
        for (int num = 2; num <= n; num++) {
            int flag = 0;
            for (int i = 2; i <= (num / 2); i++) {
                if ((num % i) == 0) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                System.out.print(num + " ");
            }

        }
    }

}
