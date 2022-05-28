import java.util.Scanner;

public class BinaryScarch {
    static int binaryScarch(int[] arr, int n, int key, int l, int u) {

        int mid;
        if (l <= u) {
            mid = (l + u) / 2;
            if (key == arr[mid]) {
                return (mid);
            } else if (key < arr[mid]) {
                return binaryScarch(arr, n, key, l, mid - 1);
            } else
                return binaryScarch(arr, n, key, mid + 1, u);
        } else
            return 0;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " elements in array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the Scarch element: ");
        int key = sc.nextInt();
        int lower = 0, upper = n - 1;
        int flag = binaryScarch(array, n, key, lower, upper);
        if (flag == 0) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Elemnt is found in locatin: " + (binaryScarch(array, n, key, lower, upper) + 1));
        }

    }

}
