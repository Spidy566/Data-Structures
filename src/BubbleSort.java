import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }

    private static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length -1; i++) { //we don't need to check the last element
            for (int j = 0; j < numbers.length - 1 - i; j++) { //every iteration, the largest number will be at the end
                if (numbers[j] > numbers[j + 1]) { // swap if the current number is greater than the next number
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
