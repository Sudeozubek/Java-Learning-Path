public class CountOddEven {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 8, 10, 13, 15};

        int evenCount = 0, oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
