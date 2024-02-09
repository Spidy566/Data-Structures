import java.util.Random;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) { //generate random numbers between 0 and 99
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before sorting:" + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("After sorting:" + Arrays.toString(numbers));


    }

    private static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) { //start at 0 because we assume the first element is sorted
            int minIndex = i; //store the index of the minimum value
            for (int j = i + 1; j < numbers.length; j++) { //start at i + 1 because we assume the first element is sorted
                if (numbers[j] < numbers[minIndex]) { //if the current value is less than the minimum value
                    minIndex = j; //set the index of the minimum value to the current value
                }
            }
            int temp = numbers[minIndex]; //store the minimum value
            numbers[minIndex] = numbers[i]; //set the minimum value to the current value
            numbers[i] = temp; //set the current value to the minimum value
        }
    }
}