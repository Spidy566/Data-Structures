import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String args[]) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i= 0; i < numbers.length; i++) numbers[i] = rand.nextInt(100);
        System.out.println("Before Sorting: " + Arrays.toString(numbers));
        quickSort(numbers, 0 , numbers.length - 1);
        System.out.println("After Sorting: " + Arrays.toString(numbers));
    }

    private static void quickSort(int[] numbers, int start, int end) {
        if (end  <= start) return; // base case
        int pivot = partition(numbers, start, end);
        quickSort(numbers, start, end - 1);
        quickSort(numbers, start + 1, end);
    }

    private static int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (numbers[j] < pivot) {
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        i++;
        int temp = numbers[i];
        numbers[i] = numbers[end];
        numbers[end] = temp;
        return i;
    }
}
