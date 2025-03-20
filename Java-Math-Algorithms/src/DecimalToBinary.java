import java.util.Scanner;

public class DecimalToBinary{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();

        System.out.println("Binary: " + Integer.toBinaryString(num));

        scan.close();
    }
}