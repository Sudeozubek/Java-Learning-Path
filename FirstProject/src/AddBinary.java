import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci binary sayıyı girin: ");
        String binary1 = scanner.next();

        System.out.print("İkinci binary sayıyı girin: ");
        String binary2 = scanner.next();

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        int sum = num1 + num2;

        System.out.println("Toplam (Binary): " + Integer.toBinaryString(sum));

        scanner.close();
    }
}
