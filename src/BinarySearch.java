import java.util.Scanner;

public class BinarySearch {
    int binarySearch(int array[], int x, int low, int high) {

        // Repeat until the pointers low and high meet each other
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x)
                return mid;

            if (array[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String args[]) {
        int n,array[],x,c;
        BinarySearch ob = new BinarySearch();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        n = in.nextInt();
        array = new int[n];
        System.out.println("Enter those " + n + " elements ");

        for (c = 0; c < n; c++)
            array[c] = in.nextInt();
        System.out.println("Enter value to find ");
        x = in.nextInt();
        int result = ob.binarySearch(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}
