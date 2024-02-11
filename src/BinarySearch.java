import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10]; //create an array of 10 elements

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); //generate random numbers between 0 and 99
        }

        Arrays.sort(numbers); //for binary search, the array must be sorted
        System.out.println("Sorted Array:" + java.util.Arrays.toString(numbers));
        Scanner targetObj = new Scanner(System.in); //create a Scanner object
        System.out.println("Enter the target number: ");
        int target = targetObj.nextInt(); //Read user input
        int index = binarySearch(numbers, target);
        if (index != -1) {
            System.out.println("The target number is at index " + index);
        }
        else {
            System.out.println("The target number is not in the array");
        }
    }

    private static int binarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middlePosition = (low + high ) / 2;
            int middleValue = numbers[middlePosition];

            if (middleValue == target) {
                return middlePosition;
            }
            else if (middleValue < target) {
                low = middlePosition + 1;
            }
            else {
                high = middlePosition - 1;
            }
        }
        return -1;
    }
}

