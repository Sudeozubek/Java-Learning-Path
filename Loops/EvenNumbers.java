import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        scan.close();

        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
