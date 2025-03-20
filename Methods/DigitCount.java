import java.util.Scanner;
public class digit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.print("Enter a value: ");
        int num = scan.nextInt();
        scan.close();

        int result = digitCount(num);
        System.out.println("Digit count: " + result);
    }
    public static int digitCount(int number) {
        int digit = 0;

        while (number > 0) {
            number = number / 10;
            digit++;
        }
        return digit;
    }
}
