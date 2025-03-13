public class Sum2 {
    public static int findSum(int[] arr, int n) {
        int sum = 0; // Variable to store the sum of elements

        // Loop to iterate over the array and calculate the sum
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Adding each element to sum
        }

        return sum; // Returning the total sum
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 3, 4, 5};
        int n1 = arr1.length;
        System.out.println("Sum: " + findSum(arr1, n1)); // Output: 15

        // Example 2
        int[] arr2 = {1, 2, 1, 1, 5, 1};
        int n2 = arr2.length;
        System.out.println("Sum: " + findSum(arr2, n2)); // Output: 11
    }
}
