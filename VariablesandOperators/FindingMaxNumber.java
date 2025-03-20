import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scan.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scan.nextInt();
        scan.close();

        if (a > b) {
            System.out.println("Max number: " + a);
        } else {
            System.out.println("Max number: " + b);
        }
    }
}
