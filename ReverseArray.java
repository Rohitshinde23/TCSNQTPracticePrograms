// import java.util.Arrays;

// public class ReverseArray {
//     public static int[] reverseArray(int[] arr) {
//         int n = arr.length;
//         int[] reversedArr = new int[n];
//         for (int i = 0; i < n; i++) {
//             reversedArr[i] = arr[n - 1 - i];
//         }
//         return reversedArr;
//     }

//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40};
//         System.out.println("Original Array: " + Arrays.toString(arr));
//         int[] reversedArr = reverseArray(arr);
//         System.out.println("Reversed Array: " + Arrays.toString(reversedArr));
//     }
// }
import java.util.Arrays;
public class ReverseArray {
    public static void reverseArray(int arr[]){
        int left = arr[0], right = arr.length-1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
            
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("Original array: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
