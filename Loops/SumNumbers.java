import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        scan.close();

        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum: " + sum);
    }
}
