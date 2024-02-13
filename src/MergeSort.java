import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before Sorting: " + Arrays.toString(numbers));
        mergeSort(numbers);
        System.out.println("After Sorting: " + Arrays.toString(numbers));
    }

    private static void mergeSort(int[] numbers) {
        if (numbers.length < 2) return; // Base case
        int mid = numbers.length / 2;
        int[] left = new int[mid];
        int[] right = new int[numbers.length - mid];
        System.arraycopy(numbers, 0, left, 0, mid);
        if (numbers.length - mid >= 0)
            System.arraycopy(numbers, mid, right, 0, numbers.length - mid); // Copy the right half of the array
        mergeSort(left);
        mergeSort(right);
        merge(numbers, left, right);
    }

    private static void merge(int[] numbers, int[] left, int[] right) {
        int i = 0, j = 0, k = 0; // i for left, j for right, k for numbers
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) { // if the left number is less than or equal to the right number
                numbers[k++] = left[i++]; // copy the left number to the numbers array
            } else {
                numbers[k++] = right[j++]; // copy the right number to the numbers array
            }
        }
        while (i < left.length) { // if there are any remaining elements in the left array
            numbers[k++] = left[i++]; // copy them to the numbers array
        }
        while (j < right.length) { // if there are any remaining elements in the right array
            numbers[k++] = right[j++]; // copy them to the numbers array
        }
    }
}
