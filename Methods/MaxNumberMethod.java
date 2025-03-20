import java.util.Scanner;

public class MaxNumberMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scan.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scan.nextInt();
        scan.close();

        int max = findMax(a, b);
        System.out.println("Max number: " + max);
    }
    public static int findMax(int num1, int num2) {
        if(num1 > num2) {
            return num1;
        }else{
            return num2;
        }
    }
}
