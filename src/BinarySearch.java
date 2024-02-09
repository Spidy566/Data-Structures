public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,9,11};
        int target = 9;
        System.out.println(binarySearch(numbers, target));
    }

    public static int binarySearch(int[] numbers, int target) {
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

