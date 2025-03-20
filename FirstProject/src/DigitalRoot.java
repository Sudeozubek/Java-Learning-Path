import java.util.Scanner;
public class DigitalRoot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int num=scan.nextInt();

        while(num>=10){
            int sum = 0;
            while(num>0){
                sum += num%10;
                num /=10;
            }
            num = sum;
        }
        System.out.println("One digit number: " + num);

        scan.close();
    }
}