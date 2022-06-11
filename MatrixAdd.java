import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;

public class MatrixAdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number row: ");
        int n = sc.nextInt();
        System.out.print("Enter the number collumn: ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] c = new int[n][m];
        System.out.println("Enter the element of 1st matrix::");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element of 2nd matrix::");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter b[" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("The resultant matrix is:  ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }
    }
}
