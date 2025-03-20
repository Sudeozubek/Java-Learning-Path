import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        if (num < 0) {
            num = Math.abs(num);
        }

        int result = sumOfDigits(num);
        System.out.println("Sum of digits: " + result);
    }
    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
