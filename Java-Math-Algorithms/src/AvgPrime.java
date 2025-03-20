import java.util.Scanner;

public class AvgPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        int sum = 0, count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
        }

        System.out.println("Average of prime numbers: " + (sum / (double) count));

        scanner.close();
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
