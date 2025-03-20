public class MaxInArray {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 20, 12, 30, 7};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Max number: " + max);
    }
}
