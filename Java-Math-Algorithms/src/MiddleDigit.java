import java.util.Scanner;
public class MiddleDigit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 5-digit number: ");
        int num = scan.nextInt();

        if(num < 1000 || num > 99999){
            System.out.println("Enter 5-digit number: ");
        }else{
            int middle = (num/100) % 10;
            System.out.println("Middle digit: " + middle);
        }
        scan.close();
    }
}
