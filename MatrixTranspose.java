import java.util.Scanner;

public class MatrixTranspose {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number row: ");
        int n = sc.nextInt();
        System.out.print("Enter the number collumn: ");
        int m = sc.nextInt();
        int[][] original = new int[n][m];
        int[][] transpose = new int[n][m];

        System.out.println("Enter the element of the matrix::");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter a[" + i + "][" + j + "]: ");
                original[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                transpose[i][j] = original[j][i];
            }
        }
        System.out.println("Original matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(original[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println("After tanspose the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + " ");

            }
            System.out.println();

        }
    }
}
