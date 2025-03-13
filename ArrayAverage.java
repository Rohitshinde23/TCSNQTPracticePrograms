public class ArrayAverage {
    public static double findAverage(int[] arr, int n) {
        int sum = 0; // Variable to store sum of elements

        // Loop to calculate sum of array elements
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Add each element to sum
        }

        // Calculate average by dividing sum by number of elements
        return (double) sum / n;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 3, 4, 5};
        int n1 = arr1.length;
        System.out.println("Average: " + findAverage(arr1, n1)); // Output: 3.0

        // Example 2
        int[] arr2 = {1, 2, 1, 1, 5, 1};
        int n2 = arr2.length;
        System.out.println("Average: " + findAverage(arr2, n2)); // Output: 1.8
    }
}
