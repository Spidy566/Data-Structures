import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        
        System.out.println("Array: " + Arrays.toString(numbers));
        Scanner targetObj = new Scanner(System.in);
        System.out.println("Enter the target number: ");
        int target = targetObj.nextInt();
        int index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("The target number is at index " + index);
        }
        else {
            System.out.println("The target number is not in the array");
        }
    }

    private static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
