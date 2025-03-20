import java.util.Scanner;
public class DivisionBySubtraction {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number to be dividend : ");
        int dividend = scan.nextInt();

        System.out.print("Enter divisor number: ");
        int divisor = scan.nextInt();

        int count;

        for(count = 0; dividend >= divisor; count++){
            dividend -= divisor;
        }

        System.out.println("Sum: " + count);
        System.out.println("Remainder: "+ dividend);

        scan.close();
    }
}
