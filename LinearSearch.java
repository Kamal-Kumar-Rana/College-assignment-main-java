import java.util.Scanner;

public class LinearSearch {

    public static int findKey(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {

                return i;
            }
        }

        return -1;

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
        System.out.print("Enter the Search element: ");
        int key = sc.nextInt();

        if (findKey(array, key) == -1) {
            System.out.println("Element  is not found");
        } else {
            System.out.println(key + " is found in the array location: " + (findKey(array, key) + 1));
        }

    }
}
