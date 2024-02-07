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
            int middlePostion = (low + high ) / 2;
            int middleValue = numbers[middlePostion];

            if (middleValue == target) {
                return middlePostion;
            }
            else if (middleValue < target) {
                low = middlePostion + 1;
            }
            else {
                high = middlePostion - 1;
            }
        }
        return -1;
    }
}

