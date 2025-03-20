import java.util.Scanner;

public class SumNNN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir basamaklı bir sayı girin: ");
        int n = scanner.nextInt();

        if (n < 0 || n > 9) {
            System.out.println("Lütfen 0 ile 9 arasında bir sayı girin!");
        } else {
            int nn = (n * 10) + n;       // 5 → 55 (5 * 10 + 5)
            int nnn = (n * 100) + nn;    // 5 → 555 (5 * 100 + 55)

            int sum = n + nn + nnn;

            System.out.println(n + " + " + nn + " + " + nnn + " = " + sum);
        }

        scanner.close();
    }
}
