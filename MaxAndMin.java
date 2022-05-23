import java.util.Scanner;

public class MaxAndMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements in array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        CalculateMaxAndMin obj = new CalculateMaxAndMin();
        System.out.println("Maximum value in  the array is: " + obj.max(array));
        System.out.println("Minimum value in  the array is: " + obj.min(array));
    }

}

class CalculateMaxAndMin {
    int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
