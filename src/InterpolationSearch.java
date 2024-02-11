import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InterpolationSearch {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length -1; i++) {
            numbers[i] = rand.nextInt(100);
        }
        Arrays.sort(numbers); // for interpolation search, the array must be sorted
        System.out.println("Arrays: " + Arrays.toString(numbers));
        Scanner targetObj = new Scanner(System.in);
        System.out.println("Enter the target number: ");
        int target = targetObj.nextInt();
        int index = interpolationSearch(numbers, target);
        if (index != -1) {
            System.out.println("The target number is at index " + index);
        }
        else {
            System.out.println("The target number is not in the array");
        }
    }

    private static int interpolationSearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high && target >= numbers[low] && target <= numbers[high]) { //check if the target is within the range
            int probe = low + ((high - low) * (target - numbers[low]) / (numbers[high] - numbers[low])); //calculate probe using interpolation formula
            System.out.println("Probe: " + probe);
            if (numbers[probe] == target) {
                return probe;
            }
            else if (numbers[probe] < target) {
                low = probe + 1;
            }
            else {
                high = probe - 1;
            }
        }
        return -1;
    }
}
