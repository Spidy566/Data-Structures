import java.util.Random; //for generating random numbers

public class InsertionSort {
    public static void main (String[] args) {
        Random rand =  new Random();
        int[] numbers = new int[10];//create an array of 10 elements

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); //generate random numbers between 0 and 99
        }

        System.out.println("Before sorting:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("\nAfter sorting:");
        printArray(numbers);
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
    private static void printArray(int[] numbers) { //helper method to print array
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
