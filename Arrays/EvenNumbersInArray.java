public class EvenNumbersInArray {
    public static void main(String[] args) {
      
        int[] numbers = {3, 10, 17, 24, 36, 51, 72};

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println("Even number: " + num);
            }
        }
    }
}
