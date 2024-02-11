import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) numbers[i] = rand.nextInt(100);
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }

    private static void insertionSort(int[] inputArray) { //insertion sort algorithm
        for (int i = 1;i < inputArray.length; i++) { //start at 1 because we assume the first element is sorted
            int currentValue = inputArray[i]; //store the current value
            int j = i - 1; //store the previous value
            while (j >= 0 && inputArray[j] > currentValue) { //while the current value is less than the previous value
                inputArray[j + 1] = inputArray[j]; //Shifts the larger element to the right
                j--; //decrement j
            }
            inputArray[j + 1] = currentValue; //set the current value to the previous value
        }
    }
}