import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
