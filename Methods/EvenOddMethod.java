import java.util.Scanner;

public class EvenOddMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        checkEvenOdd(num);
    }
    public static void checkEvenOdd(int number) {
        if(number % 2 == 0) {
            System.out.println("This is an even number.");
        }else{
            System.out.println("This is an odd number.");
        }
    }
}
